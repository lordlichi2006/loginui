module com.dami.loginui {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.dami.loginui to javafx.fxml;
    exports com.dami.loginui;
}
