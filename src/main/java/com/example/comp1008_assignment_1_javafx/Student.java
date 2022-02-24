package com.example.comp1008_assignment_1_javafx;

import java.awt.*;
import java.util.ArrayList;

public class Student {
    private String firstName, lastName;
    private int studentNumber;
    private ArrayList<String> favouriteActivities;
//    handle this later!!!
    private Image studentImage;

    public Student(String firstName, String lastName, int studentNumber, ArrayList<String> favouriteActivities) {
        setFirstName(firstName);
        setLastName(lastName);
        setStudentNumber(studentNumber);
        setFavouriteActivities(favouriteActivities);

    }

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

    public void setStudentNumber(int studentNumber) {
        if (studentNumber >= 100000000 && studentNumber <= 999999999) {
            this.studentNumber = studentNumber;
        }
        else {
            throw new IllegalArgumentException(studentNumber + " is not a valid student number as it does not belong in the range of 100000000 -> 999999999.");
        }
    }

//    I doubt this validation .... lets come back to it later...
    public void setFavouriteActivities(ArrayList<String> favouriteActivities) {
        if (favouriteActivities == null) {
            throw new IllegalArgumentException("The list of favourite activities cannot be empty!!");
        }
        else {
            this.favouriteActivities = favouriteActivities;
        }
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public ArrayList<String> getFavouriteActivities() {
        return favouriteActivities;
    }

    public Image getStudentImage() {
        return studentImage;
    }

    public void addFavouriteActivity(String activity) {
        if (activity.equals("")) {
            throw new IllegalArgumentException("Empty activity cannot be added!!");
        }
        else {
            favouriteActivities.add(activity);
        }
    }
}


