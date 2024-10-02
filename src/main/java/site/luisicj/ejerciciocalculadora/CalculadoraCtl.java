package site.luisicj.ejerciciocalculadora;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class CalculadoraCtl {

    @FXML
    private Button btCalcular;

    @FXML
    private Label lbResultado;

    @FXML
    private RadioButton rbOperadorEntre;

    @FXML
    private RadioButton rbOperadorMas;

    @FXML
    private RadioButton rbOperadorMenos;

    @FXML
    private RadioButton rbOperadorMul;

    @FXML
    private TextField tfOperando1;

    @FXML
    private TextField tfOperando2;

    @FXML
    void onBtCalcularClick(ActionEvent event) {
        double resultado;

        try {
            double op1 = Double.parseDouble(tfOperando1.getText());
            double op2 = Double.parseDouble(tfOperando2.getText());

            if (rbOperadorMas.isSelected()) {
                resultado = op1 + op2;
            } else if (rbOperadorMenos.isSelected()) {
                resultado = op1 - op2;
            } else if (rbOperadorMul.isSelected()) {
                resultado = op1 * op2;
            } else {

                if (op2 == 0) {
                    lbResultado.setText("No divida entre 0");
                    return;
                }

                resultado = op1 / op2;
            }

            lbResultado.setText(String.valueOf(resultado));
        } catch (NumberFormatException e) {
            lbResultado.setText("Operando inválido");
        }
    }

}
