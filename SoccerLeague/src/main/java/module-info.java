module com.example.soccerleague {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.soccerleague to javafx.fxml;
    exports com.example.soccerleague;
}