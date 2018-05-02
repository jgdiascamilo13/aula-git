/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author 02119149240
 */
public class CadClienteController implements Initializable {

    @FXML
    private JFXTextField txtNome;
    @FXML
    private JFXTextField txtEmail;
    @FXML
    private JFXTextField txtTelefone;
    @FXML
    private JFXTextField txtCpf;
    @FXML
    private JFXTextField txtRg;
    @FXML
    private JFXButton btnCancelar;
    @FXML
    private JFXButton btnSalvar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void cancelar(ActionEvent event) {
        Stage stage = (Stage) btnCancelar.getScene().getWindow();
        stage.close();

    }

    @FXML
    private void salvarAluno(ActionEvent event) {

    }

}
