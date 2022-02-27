package com.example.comp1008_assignment_1_javafx;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

public class StudentCardViewController implements Initializable {

    @FXML
    private TextArea favouriteActivitiesTextArea;

    @FXML
    private Label firstNameLabel;

    @FXML
    private Label lastNameLabel;

    @FXML
    private ImageView studentImageView;

    @FXML
    private Label studentNumberLabel;

    private Student student;

    /**
     * The initialize method creates the student object and updates the view according to its contents.
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        student = new Student("paramveer","singh", 200491057,new ArrayList<>(Arrays.asList("boxing", "painting", "singing")));
        firstNameLabel.setText(student.getFirstName());
        lastNameLabel.setText(student.getLastName());
        studentNumberLabel.setText(Integer.toString(student.getStudentNumber()));
        studentImageView.setImage(student.getStudentImage());
        for (String activity : student.getFavouriteActivities()) {
            favouriteActivitiesTextArea.appendText(String.format("%s%n",activity));
        }
    }


}