import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

public class Vista2 extends JPanel implements Observer{

    Modelo modelo;
    JLabel label;
    public Vista2(Modelo m){
        modelo = m;
        label = new JLabel("Posición de la línea: (" + modelo.getX1() + "," + modelo.getY1() + "),(" + modelo.getX2() + "," + modelo.getY2() + ")");
        add(label);
    }
    @Override
    public void update(Observable o, Object arg) {
        label.setText("Posición de la línea: (" + modelo.getX1() + "," + modelo.getY1() + "),(" + modelo.getX2() + "," + modelo.getY2() + ")");
    }
}
