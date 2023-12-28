package com.example.financepal;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.example.financepal.models.SceneModel;
import com.example.financepal.models.StageModel;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private Button btnLogin;

    @FXML
    private Button btnRegister;

    @FXML
    private TextField loginTextField;

    @FXML
    private TextField passwordTextField;

    @FXML
    void initialize() {
        btnRegister.setOnAction(e -> {
            new HelloApplication().openNewScene(anchorPane, "/com/example/requestdesktop/register-view.fxml", "Регистрация");
            anchorPane.getScene().getWindow().hide();
            Stage stage = new Stage();
            StageModel.setMyStage(stage);
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("register-view.fxml"));
            Scene scene = null;
            try {
                scene = new Scene(fxmlLoader.load(), 346, 459);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            SceneModel.setMyScene(scene);
            stage.setTitle("Регистрация");
            stage.setScene(scene);
            stage.show();
        });

        btnLogin.setOnAction(e -> {

        });
    }

}