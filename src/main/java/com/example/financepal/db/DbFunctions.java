package com.example.financepal.db;

import java.sql.*;

public class DbFunctions {
    public Connection connect_to_db() {
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + "FinancePal", "postgres", "123456");
            if (connection != null) {
                System.out.println("Подключение успешно!");
            } else {
                System.out.println("Подключение безуспешно!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }

    public void registerUser(String last_name, String first_name, String middle_name, String login, String password, String role) {
        try {
            String query = String.format("insert into users(last_name, first_name, middle_name, login, password, role) values('%s', '%s', '%s', '%s', '%s', '%s');", last_name, first_name, middle_name, login, password, role);
            Statement statement = connect_to_db().createStatement();
            statement.executeUpdate(query);
            System.out.println("Пользователь успешно создан!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public int checkLogin(String login) {
        try {
            String query = String.format("select * from users where login='%s'", login);
            Statement statement;
            statement = connect_to_db().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet resultSet = statement.executeQuery(query);
            resultSet.last();
            if (resultSet.getRow() >= 1) {
                return 0;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return 404;
        }
        return 201;
    }

    public int loginUser(String login, String password) {
        try {
            String query = String.format("select * from users where login='%s' and password='%s'", login, password);
            Statement statement = connect_to_db().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            if (!resultSet.next()) {
                return 0;
            }
            Variables.ACTIVE_USER_ID = resultSet.getString("id");
            Variables.ACTIVE_USER_LAST_NAME = resultSet.getString("last_name");
            Variables.ACTIVE_USER_FIRST_NAME = resultSet.getString("first_name");
            Variables.ACTIVE_USER_MIDDLE_NAME = resultSet.getString("middle_name");
            Variables.ACTIVE_USER_LOGIN = resultSet.getString("login");
            Variables.ACTIVE_USER_PASSWORD = resultSet.getString("password");
            Variables.ACTIVE_USER_ROLE = resultSet.getString("role");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return 404;
        }
        return 201;
    }


}
