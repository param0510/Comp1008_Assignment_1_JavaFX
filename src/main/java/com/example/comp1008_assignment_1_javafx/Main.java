package com.example.comp1008_assignment_1_javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
// The main class extends Application class
public class Main extends Application {
    /**
     * this method loads and sets up the scene on the stage
     * @param stage- this sets up the stage with the scene being loaded
     * @throws IOException - To throw Input/Output Exceptions
     */
    @Override
    public void start(Stage stage) throws IOException {
//        The student-card-view file is loaded
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("student-card-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Student Card");
        stage.setScene(scene);
//        The scene gets displayed on the screen with the title provided
        stage.show();
    }

    /**
     * The void main function invokes the launch() function
     * @param args - To get console line commands running
     */
    public static void main(String[] args) {
        launch();
    }
}