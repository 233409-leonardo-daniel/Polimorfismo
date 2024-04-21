package com.vego.historiasusuario.Controller;

import com.vego.historiasusuario.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class MenuController {

    @FXML
    private Button agregar;

    @FXML
    private Button editar;

    @FXML
    private Button salir;

    @FXML
    private Button ver;

    @FXML
    void onClickagregar(MouseEvent event) {
        HelloApplication.newStage("guardar-view","GUARDAR");
    }

    @FXML
    void onClickeditar(MouseEvent event) {
        HelloApplication.newStage("actualizar-view","ACTUALIZAR");
    }

    @FXML
    void onClicksalir(MouseEvent event) {
        HelloApplication.getStageView().close();
    }

    @FXML
    void onClickver(MouseEvent event) {
        HelloApplication.newStage("mostrar-view","MOSTRAR");
    }

    @FXML
    void initialize() {
        assert agregar != null : "fx:id=\"agregar\" was not injected: check your FXML file 'menu-view.fxml'.";
        assert editar != null : "fx:id=\"editar\" was not injected: check your FXML file 'menu-view.fxml'.";
        assert salir != null : "fx:id=\"salir\" was not injected: check your FXML file 'menu-view.fxml'.";
        assert ver != null : "fx:id=\"ver\" was not injected: check your FXML file 'menu-view.fxml'.";

    }
}
