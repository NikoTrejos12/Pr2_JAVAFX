package co.edu.uniquindio.heroefx.heroeapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class heroeApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(heroeApplication.class.getResource("heroe.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("app heroe");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}