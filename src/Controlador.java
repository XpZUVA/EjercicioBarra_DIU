import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controlador extends JFrame{
    private Modelo modelo = new Modelo();
    private Vista vista = new Vista(modelo);
    private Vista2 vista2 = new Vista2(modelo);
    private JButton btnIzq = new JButton("Mover Izquierda");
    private JButton btnDer = new JButton("Mover Derecha");
    public void configurarControlador(){

        JPanel btnPanel = new JPanel();
        setLayout(new BorderLayout());
        add(BorderLayout.NORTH, vista2);
        add(BorderLayout.CENTER, vista);
        add(BorderLayout.SOUTH, btnPanel);

        modelo.addObserver(vista);
        modelo.addObserver(vista2);

        add(vista);

        vista.setPreferredSize(new Dimension(modelo.CANVAS_ANCHO, modelo.CANVAS_ALTO));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Mover una Línea");
        pack();
        setVisible(true);
        vista.requestFocus();


        btnIzq.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                moverIzquierda();
            }
        });
        btnPanel.add(btnIzq);
        btnDer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                moverDerecha();
            }
        });
        btnPanel.add(btnDer);


    }

    public void moverIzquierda() {
        modelo.moverIzquierda();
    }

    public void moverDerecha() {
        modelo.moverDerecha();
    }


}
