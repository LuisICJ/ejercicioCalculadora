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
    }

}
