/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author 92718540206
 */
public class MenuPrincipalController implements Initializable {

    @FXML
    private JFXTextField txtNum1, txtNum2, txtResult;
    @FXML
    private JFXButton btnSomar;

    @FXML
    private void somar(ActionEvent event) {
        Double num1 = Double.parseDouble(txtNum1.getText());
        Double num2 = Double.parseDouble(txtNum2.getText());
        Double result = num1 + num2;

        this.txtResult.setText(result.toString());
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void abrirCadastroAluno(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("Aluno.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 900, 682);
            Stage stage = new Stage();
            stage.setTitle("Cadastrar Aluno");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {

        }
    }

    @FXML
    private void fecharProjeto(ActionEvent event) {
    }

    @FXML
    private void subtrair(ActionEvent event) {
    }

    @FXML
    private void multiplicar(ActionEvent event) {
    }

    @FXML
    private void dividir(ActionEvent event) {
    }

}
