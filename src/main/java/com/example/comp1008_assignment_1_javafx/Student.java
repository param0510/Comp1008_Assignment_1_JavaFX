package com.example.comp1008_assignment_1_javafx;

import java.awt.*;
import java.util.ArrayList;
import javafx.scene.image.Image;


public class Student {
    private String firstName, lastName;
    private int studentNumber;
    private ArrayList<String> favouriteActivities;
    private Image studentImage;

    /**
     * The Student constructor intializes all the instance variables of the class Student
     * @param firstName - Stores the first name of the student (String)
     * @param lastName - Stores the last name of the student (String)
     * @param studentNumber - Stores the student number of the student (int)
     * @param favouriteActivities - Stores the favourite activities of the student in the ArrayList<String>
     */
    public Student(String firstName, String lastName, int studentNumber, ArrayList<String> favouriteActivities) {
        setFirstName(firstName);
        setLastName(lastName);
        setStudentNumber(studentNumber);
        this.favouriteActivities = favouriteActivities;
        String fileName = String.format("images/%s_%d.png", firstName,studentNumber);
        studentImage = new Image(getClass().getResource(fileName).toExternalForm());

    }

    /**
     * This method sets the first name of the student and validates it to check whether it has 2 or more characters or
     * not and finally stores it after capitalizing it.
     * @param firstName - Stores the first name of the student (String)
     */
    public void setFirstName(String firstName)
    {
        firstName = firstName.toLowerCase();
        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1);
        if (firstName.length() < 2) {
            throw new IllegalArgumentException(firstName + " is not a valid first name as it has less than 2 characters!!");
        }
        else {
            this.firstName = firstName;
        }
    }

    /**
     * This method sets the last name of the student and validates it to check whether it has 2 or more characters or
     * not and finally stores it after capitalizing it.
     * @param lastName - Stores the last name of the student (String)
     */
    public void setLastName(String lastName) {
        lastName = lastName.toLowerCase();
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1);
        if (lastName.length() < 2) {
            throw new IllegalArgumentException(lastName + " is not a valid last name as it has less than 2 characters!!");
        }
        else {
            this.lastName = lastName;
        }
    }

    /**
     * This method validates the student number before assigning it to the instance variable
     * It checks whether it belongs to range 100000000 -> 999999999
     * @param studentNumber - Stores the student number of the student (int)
     */
    public void setStudentNumber(int studentNumber) {
        if (studentNumber >= 100000000 && studentNumber <= 999999999) {
            this.studentNumber = studentNumber;
        }
        else {
            throw new IllegalArgumentException(studentNumber + " is not a valid student number as it does not belong in the range of 100000000 -> 999999999.");
        }
    }

    /**
     * This get method is used to get the student's first name
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * This get method is used to get the student's last name
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * This method returns the student number of the student
     * @return studentNumber
     */
    public int getStudentNumber() {
        return studentNumber;
    }

    /**
     * This method returns the list of favourite activities done by the student
     * @return favouriteActivities
     */
    public ArrayList<String> getFavouriteActivities() {
        return favouriteActivities;
    }

    /**
     * This method returns the image of the student stored
     * @return studentImage
     */
    public Image getStudentImage() {
        return studentImage;
    }

    /**
     * This method adds one activity to the list of favourite activities after validating it for a blank String
     * @param activity - The individual activity that the user wants to add to the list
     */
    public void addFavouriteActivity(String activity) {
        if (activity.equals("")) {
            throw new IllegalArgumentException("Empty activity cannot be added!!");
        }
        else {
            favouriteActivities.add(activity);
        }
    }
}


