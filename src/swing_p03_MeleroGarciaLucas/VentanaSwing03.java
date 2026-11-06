package swing_p03_MeleroGarciaLucas;

import javax.swing.*;
import java.awt.*;

public class VentanaSwing03 extends JFrame {
    public VentanaSwing03() {
        super("Practica 03");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(50, 50, 600, 450);

        Panel miPanel = new Panel();
        this.add(miPanel);
        this.setVisible(true);
    }
}
