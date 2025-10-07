package com.example.multipleviews;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.stage.Stage;

import java.io.IOException;

public class ControladorVistaPrincipal {
    @FXML
    public void irVista1(ActionEvent e) throws IOException {
        CambiadorVistas.cargarVista("vista1.fxml", (Stage) ((Node) e.getSource()).getScene().getWindow());
    }
    @FXML
    public void irVista2(ActionEvent e) throws IOException {
        CambiadorVistas.cargarVista("vista2.fxml", (Stage) ((Node) e.getSource()).getScene().getWindow());
    }
}
