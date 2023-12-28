module com.example.financepal {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.financepal to javafx.fxml;
    exports com.example.financepal;
}