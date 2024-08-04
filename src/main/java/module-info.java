module com.example.ramzigym {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.ramzigym to javafx.fxml;
    exports com.example.ramzigym;
    exports com.example.ramzigym.controller;
    opens com.example.ramzigym.controller to javafx.fxml;
}