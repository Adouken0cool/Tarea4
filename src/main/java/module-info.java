module com.example.tarea4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tarea4 to javafx.fxml;
    exports com.example.tarea4;
}