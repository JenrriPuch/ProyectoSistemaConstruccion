module com.example.proyectosistemaconstruccion {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.proyectosistemaconstruccion to javafx.fxml;
    exports com.example.proyectosistemaconstruccion;
}