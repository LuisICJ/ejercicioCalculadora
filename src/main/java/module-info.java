module site.luisicj.ejerciciocalculadora {
    requires javafx.controls;
    requires javafx.fxml;
    opens site.luisicj.ejerciciocalculadora to javafx.fxml;
    exports site.luisicj.ejerciciocalculadora;
}