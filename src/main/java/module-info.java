module com.example.flashx {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.nisbeterik.flashx to javafx.fxml;
    exports com.nisbeterik.flashx;
}