import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Controlador controlador = new Controlador();
                controlador.configurarControlador();
            }
        });
    }
}