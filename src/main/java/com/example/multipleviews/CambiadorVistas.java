package com.example.multipleviews;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CambiadorVistas {
    public static void cargarVista(String rutaVista, Stage stage) throws IOException {
        Parent root = FXMLLoader.load(CambiadorVistas.class.getResource(rutaVista));
        Scene scenaVista = new Scene(root);
        stage.setScene(scenaVista);
        stage.show();
    }
}
