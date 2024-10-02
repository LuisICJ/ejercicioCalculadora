package site.luisicj.ejerciciocalculadora;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Clase principal de la calculadora.
 *
 * @author LuisICJ
 */
public class CalculadoraMain extends Application {

    /**
     * Inicia la aplicación JavaFX.
     * Este procedimiento es llamado por la plataforma JavaFX para iniciar la aplicación.
     *
     * @throws IOException excepción de entrada/salida
     */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CalculadoraMain.class.getResource("CalculadoraView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Calculadora");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Punto de entrada de la aplicación.
     * Este procedimiento es llamado cuando se ejecuta la aplicación desde la línea de comandos.
     *
     * @param args argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        launch();
    }
}