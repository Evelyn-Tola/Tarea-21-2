package com.mycompany.javafxcalculadora;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculadoraController {

    @FXML
    private Button btnLimpiar;

    @FXML
    private TextField txtPantalla;
    double numero;
    String operacion;


    @FXML
    void calcular(ActionEvent event) {

         double numero2 = Double.parseDouble(txtPantalla.getText());
        double resultado = 0;
        
        switch(operacion){
            case "sumar":
                 resultado = numero + numero2;
                break;
            case "resta":
                resultado = numero - numero2;
                break;
            case "multiplicar":
                resultado = numero * numero2;
                break;
            case "dividir":
                resultado = numero / numero2;
                break;
        }
        
        txtPantalla.setText(resultado+"");
        
    }

    @FXML
    void dividir(ActionEvent event) {

        numero = Double.parseDouble(txtPantalla.getText());
        txtPantalla.setText("");
        operacion = "dividir";
    }

    @FXML
    void escribir0(ActionEvent event) {
        txtPantalla.setText(txtPantalla.getText()+"0");
    }

    @FXML
    void escribir1(ActionEvent event) {
        txtPantalla.setText(txtPantalla.getText()+"1");
    }

    @FXML
    void escribir2(ActionEvent event) {
        txtPantalla.setText(txtPantalla.getText()+"2");
    }

    @FXML
    void escribir3(ActionEvent event) {
        txtPantalla.setText(txtPantalla.getText()+"3");
    }

    @FXML
    void escribir4(ActionEvent event) {
        txtPantalla.setText(txtPantalla.getText()+"4");
    }

    @FXML
    void escribir5(ActionEvent event) {
        txtPantalla.setText(txtPantalla.getText()+"5");
    }

    @FXML
    void escribir6(ActionEvent event) {
        txtPantalla.setText(txtPantalla.getText()+"6");
    }

    @FXML
    void escribir7(ActionEvent event) {
        txtPantalla.setText(txtPantalla.getText()+"7");
    }

    @FXML
    void escribir8(ActionEvent event) {
        txtPantalla.setText(txtPantalla.getText()+"8");
    }

    @FXML
    void escribir9(ActionEvent event) {
        txtPantalla.setText(txtPantalla.getText()+"9");
    }

    @FXML
    void limpiarP(ActionEvent event) {

        txtPantalla.setText("");
    }

    @FXML
    void multiplicar(ActionEvent event) {

         numero = Double.parseDouble(txtPantalla.getText());
        txtPantalla.setText("");
        operacion = "multiplicar";
    }

    @FXML
    void punto(ActionEvent event) {
         txtPantalla.setText(txtPantalla.getText()+".");
    }

    @FXML
    void restar(ActionEvent event) {

         numero = Double.parseDouble(txtPantalla.getText());
        txtPantalla.setText("");
        operacion = "restar";
    }

    @FXML
    void sumar(ActionEvent event) {

         numero = Double.parseDouble(txtPantalla.getText());
        txtPantalla.setText("");
        operacion = "sumar";
    }

}