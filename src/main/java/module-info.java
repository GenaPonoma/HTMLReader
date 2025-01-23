module org.example.htmlreader {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.htmlreader to javafx.fxml;
    exports org.example.htmlreader;
}