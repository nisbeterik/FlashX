module com.example.flashx {
    requires javafx.controls;
    requires javafx.fxml;

    // Opens for FXML reflective access
    opens com.nisbeterik.flashx to javafx.fxml;

    // Opens the model package for reflective access during testing
    opens com.nisbeterik.flashx.model;

    exports com.nisbeterik.flashx;
}