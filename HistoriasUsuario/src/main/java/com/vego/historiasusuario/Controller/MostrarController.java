package com.vego.historiasusuario.Controller;


import com.vego.historiasusuario.HelloApplication;
import com.vego.historiasusuario.models.BaseDeDatosUno;
import com.vego.historiasusuario.models.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class MostrarController {


    @FXML
    private TableColumn<?, ?> edadColumn;

    @FXML
    private TableColumn<?, ?> matriculaColumn;

    @FXML
    private TableColumn<?, ?> nombreColumn;

    @FXML
    private Button salir;

    @FXML
    private TableView<Student> tableView;

    @FXML
    void onClicksalir(ActionEvent event) {
        HelloApplication.getStageView().close();

    }

    @FXML
    void initialize() {
        assert salir != null : "fx:id=\"salir\" was not injected: check your FXML file 'mostrar-view.fxml'.";
        assert tableView != null : "fx:id=\"tableView\" was not injected: check your FXML file 'mostrar-view.fxml'.";
        assert matriculaColumn != null : "fx:id=\"matriculaColumn\" was not injected: check your FXML file 'mostrar-view.fxml'.";
        assert nombreColumn != null : "fx:id=\"nombreColumn\" was not injected: check your FXML file 'mostrar-view.fxml'.";
        assert edadColumn != null : "fx:id=\"edadColumn\" was not injected: check your FXML file 'mostrar-view.fxml'.";

        System.out.println("MostrarController initialize() method called.");


        matriculaColumn.setCellValueFactory(new PropertyValueFactory<>("matricula"));
        nombreColumn.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        edadColumn.setCellValueFactory(new PropertyValueFactory<>("edad"));


        cargarListaAlumnos();
    }

    private void cargarListaAlumnos() {
        System.out.println("Cargando lista de alumnos...");

        BaseDeDatosUno baseDeDatosUno= new BaseDeDatosUno();
        ArrayList<Student> students = baseDeDatosUno.getAllStudents();


        ObservableList<Student> observableList = FXCollections.observableArrayList(students);


        tableView.setItems(observableList);
        System.out.println("Lista de alumnos cargada en el TableView.");
    }

}
