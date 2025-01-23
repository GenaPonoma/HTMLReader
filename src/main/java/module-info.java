module org.example.htmlreader {
    requires javafx.fxml;
    requires javafx.web;
    requires org.apache.commons.io;


    opens org.example.htmlreader to javafx.fxml;
    exports org.example.htmlreader;
}