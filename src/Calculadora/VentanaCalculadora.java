package Calculadora;

import Botones.PanelSimpleBoxLayoutBox;

import javax.swing.*;
import java.awt.*;

public class VentanaCalculadora extends JFrame{
    private BoxCalculator caja;
    public VentanaCalculadora(){

        super("Ventana sobre la que aplicamos Layouts");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Tamaños recomendados
        this.setMinimumSize(new Dimension(400, 300));

        JPanel panelArriba = new JPanel((new GridLayout(3,1)));
        panelArriba.add(new JLabel("Calculadora",SwingConstants.CENTER));
        panelArriba.add(new JLabel("0",SwingConstants.CENTER));

        caja = new BoxCalculator();
        this.add(panelArriba);
        this.add(caja);

        pack();
        setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
