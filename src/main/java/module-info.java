module com.example.mini_projet {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.mini_projet to javafx.fxml;
    exports com.example.mini_projet;
}