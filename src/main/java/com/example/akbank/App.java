package com.example.akbank;
import com.example.akbank.Views.ViewFactory;
import com.example.akbank.Models.Model;
import com.example.akbank.Views.ViewFactory;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) {
        Model.getInstance().getViewFactory().showLoginWindow();
    }
}
