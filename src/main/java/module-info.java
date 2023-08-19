module com.example.flashx {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.flashx to javafx.fxml;
    exports com.example.flashx;
}