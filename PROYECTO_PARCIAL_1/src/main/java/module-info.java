module com.example.proyecto_parcial_1 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.proyecto_parcial_1 to javafx.fxml;
    exports com.example.proyecto_parcial_1;
}