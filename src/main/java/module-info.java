module com.example.samproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.samproject to javafx.fxml;
    exports com.example.samproject;
}