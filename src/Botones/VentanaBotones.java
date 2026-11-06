package Botones;

import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JFrame;

public class VentanaBotones extends JFrame{
    private PanelSimpleBoxLayoutBox psboxlbox;
    public VentanaBotones(){

        super("Ventana sobre la que aplicamos Layouts");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Tamaños recomendados
        this.setMinimumSize(new Dimension(400, 300));

        psboxlbox = new PanelSimpleBoxLayoutBox();
        psboxlbox.setBorder(BorderFactory.createTitledBorder("PanelSimpleBoxLayoutBox"));
        this.add(psboxlbox);

        setLocationRelativeTo(null);
        this.setVisible(true);
    }
}

