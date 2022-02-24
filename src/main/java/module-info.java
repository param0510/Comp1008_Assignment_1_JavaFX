module com.example.comp1008_assignment_1_javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.comp1008_assignment_1_javafx to javafx.fxml;
    exports com.example.comp1008_assignment_1_javafx;
}