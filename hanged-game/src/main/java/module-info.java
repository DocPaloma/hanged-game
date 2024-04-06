module com.example.hangedgame {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.hangedgame to javafx.fxml;
    opens com.example.hangedgame.controller to javafx.fxml;
    exports com.example.hangedgame;
}