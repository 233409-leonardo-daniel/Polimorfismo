package com.vego.historiasusuario.Controller;


import com.vego.historiasusuario.HelloApplication;
import com.vego.historiasusuario.models.*;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class GuardarController {
    private Gestor baseDeDatosUno = new BaseDeDatosUno();
    private Gestor baseDeDatosDos = new BaseDeDatosDos();
    private Gestor baseDeDatosTres = new BaseDeDatosTres();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField Edad;

    @FXML
    private TextField Matricula;

    @FXML
    private TextField Nombre;

    @FXML
    private Button agregarE;

    @FXML
    private Button salir;

    @FXML
    void onClickagregarE(MouseEvent event) {
        try {

            String nombre = Nombre.getText();
            int matricula = Integer.parseInt(Matricula.getText());
            int edad = Integer.parseInt(Edad.getText());


            Student student = new Student(matricula, nombre, edad);


            baseDeDatosUno.save(student);
            baseDeDatosDos.save(student);
            baseDeDatosTres.save(student);


            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Éxito");
            alert.setHeaderText(null);
            alert.setContentText("Estudiante agregado exitosamente");
            alert.showAndWait();


            Nombre.clear();
            Edad.clear();
            Matricula.clear();
        } catch (Exception e) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("No se pudo agregar al estudiante");
            alert.showAndWait();
        }
    }

    @FXML
    void onClicksalir(MouseEvent event) {

        HelloApplication.getStageView().close();
    }

    @FXML
    void initialize() {
        assert Edad != null : "fx:id=\"Edad\" was not injected: check your FXML file 'guardar-view.fxml'.";
        assert Matricula != null : "fx:id=\"Matricula\" was not injected: check your FXML file 'guardar-view.fxml'.";
        assert Nombre != null : "fx:id=\"Nombre\" was not injected: check your FXML file 'guardar-view.fxml'.";
        assert agregarE != null : "fx:id=\"agregarE\" was not injected: check your FXML file 'guardar-view.fxml'.";
        assert salir != null : "fx:id=\"salir\" was not injected: check your FXML file 'guardar-view.fxml'.";

    }

}
