import java.awt.*;
import java.util.Observable;

public class Modelo extends Observable{
    public static final int CANVAS_ANCHO = 400;
    public static final int CANVAS_ALTO = 140;
    public static final Color COLOR_LINEA = Color.BLACK;
    public static final Color CANVAS_FONDO = Color.CYAN;

    private int x1 = CANVAS_ANCHO / 2;
    private int y1 = CANVAS_ALTO / 8;
    private int x2 = x1;
    private int y2 = CANVAS_ALTO / 8 * 6;


    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public void moverIzquierda() {
        x1 -= 10;
        x2 -= 10;
        notifyObservers(); // Notificar a los observadores sobre el cambio
    }

    public void moverDerecha() {
        x1 += 10;
        x2 += 10;
        notifyObservers(); // Notificar a los observadores sobre el cambio
    }
}
