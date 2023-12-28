module com.example.financepal {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.postgresql.jdbc;
    requires java.sql;


    opens com.example.financepal to javafx.fxml;
    exports com.example.financepal;

    opens com.example.financepal.db to javafx.fxml;
    exports com.example.financepal.db;

    opens com.example.financepal.models to javafx.fxml;
    exports com.example.financepal.models;
}