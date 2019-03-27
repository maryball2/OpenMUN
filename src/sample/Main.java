/*
Title: OpenMUN
Author: Riley Carpenter
TODO: Make the program
 */
package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

import java.awt.*;

public class Main extends Application {
    @Override

    public void start(Stage primaryStage) throws Exception{
        //Get local graphics environmet
        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        int width = gd.getDisplayMode().getWidth();
        int height = gd.getDisplayMode().getHeight();

        //Open Primary stage
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene primaryScene = new Scene(root, width, height, Color.web("#5B92E5",1.0));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(primaryScene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
