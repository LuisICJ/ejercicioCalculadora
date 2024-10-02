package site.luisicj.ejerciciocalculadora;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

/**
 * Controlador de la calculadora.
 * Este controlador se encarga de manejar los eventos y lógica de la calculadora.
 *
 * @author LuisICJ
 */
public class CalculadoraCtl {

    /**
     * Botón para calcular el resultado.
     */
    @FXML
    private Button btCalcular;

    /**
     * Etiqueta para mostrar el resultado.
     */
    @FXML
    private Label lbResultado;

    /**
     * RadioButton para seleccionar la operación de suma.
     */
    @FXML
    private RadioButton rbOperadorMas;

    /**
     * RadioButton para seleccionar la operación de resta.
     */
    @FXML
    private RadioButton rbOperadorMenos;

    /**
     * RadioButton para seleccionar la operación de multiplicación.
     */
    @FXML
    private RadioButton rbOperadorMul;

    /**
     * RadioButton para seleccionar la operación de división.
     */
    @FXML
    private RadioButton rbOperadorEntre;

    /**
     * TextField para ingresar el primer operando.
     */
    @FXML
    private TextField tfOperando1;

    /**
     * TextField para ingresar el segundo operando.
     */
    @FXML
    private TextField tfOperando2;

    /**
     * Maneja el evento de clic en el botón de calcular.
     * Realiza la operación seleccionada y muestra el resultado en la etiqueta.
     *
     * @param event evento de clic en el botón
     */
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
