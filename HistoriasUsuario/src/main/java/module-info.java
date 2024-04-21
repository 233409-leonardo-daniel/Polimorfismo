module com.vego.historiasusuario {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.vego.historiasusuario to javafx.fxml;
    exports com.vego.historiasusuario;
    exports com.vego.historiasusuario.Controller;
    opens com.vego.historiasusuario.Controller to javafx.fxml;
}