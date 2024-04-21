package com.vego.historiasusuario;

import com.vego.historiasusuario.models.BaseDeDatosDos;
import com.vego.historiasusuario.models.BaseDeDatosTres;
import com.vego.historiasusuario.models.BaseDeDatosUno;
import com.vego.historiasusuario.models.Student;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;



import java.io.IOException;



public class HelloApplication extends javafx.application.Application {
    private static Stage stageView;
    private static Stage stageRoot;
    private static Student student;
    private static BaseDeDatosUno baseDeDatosUno;
    private static BaseDeDatosDos baseDeDatosDos;
    private static BaseDeDatosTres baseDeDatosTres;
    @Override
    public void start(Stage stage) throws IOException {
        stageRoot = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("menu-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        stage.setTitle("NameApplication - Home");
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

    public static void newStage(String fxml, String title) {
        stageView = new Stage();
        Scene scene = null;
        try {
            scene = new Scene(loadFXML(fxml));

            stageView.setTitle(title);
            stageView.setScene(scene);
            stageView.centerOnScreen();
            stageView.initOwner(stageRoot);
            stageView.initModality(Modality.APPLICATION_MODAL);
            stageView.showAndWait();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Stage getStageView(){
        return stageView;
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static Student getCasos() {
        return student;
    }

    public static void main(String[] args) {
        launch();
        System.exit(1);
    }
}