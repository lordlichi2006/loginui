module com.dami.loginui {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.dami.loginui to javafx.fxml;
    exports com.dami.loginui;
}
