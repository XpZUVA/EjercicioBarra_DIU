import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

public class Vista extends Canvas implements Observer{

    private Modelo modelo;


    public Vista(Modelo m){
        modelo = m;


    }
    public void paint(Graphics g) {
        super.paint(g);
        this.setBackground(Modelo.CANVAS_FONDO);
        g.setColor(Modelo.COLOR_LINEA);
        g.drawLine(modelo.getX1(), modelo.getY1(), modelo.getX2(), modelo.getY2());
    }

    @Override
    public void update(Observable obs, Object arg) {
        repaint();
    }


}



