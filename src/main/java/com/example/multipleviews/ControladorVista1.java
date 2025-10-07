package com.example.multipleviews;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class ControladorVista1 {
    @FXML
    public void irVistaPrincipal(ActionEvent e) throws IOException {
        CambiadorVistas.cargarVista("vista-principal.fxml", (Stage) ((Node) e.getSource()).getScene().getWindow());
    }
}
