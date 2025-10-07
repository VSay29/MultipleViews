module com.example.multipleviews {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;


    opens com.example.multipleviews to javafx.fxml;
    exports com.example.multipleviews;
}