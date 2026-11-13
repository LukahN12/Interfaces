package Eventos;

import javax.swing.*;
import java.awt.*;

public class VentanaEventos extends JFrame{

    private Panel1Eventos panelEventos1;
    private Panel2Eventos panelEventos2;

    public VentanaEventos(){

        super("Metodos para gestionar el oyente del evento");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Tamaños recomendados
        this.setMinimumSize(new Dimension(400, 300));

       // panelEventos1 = new PanelSEventos();

        panelEventos2 = new Panel2Eventos();

        this.add(panelEventos2);
        setLocationRelativeTo(null);
        this.setVisible(true);
    }
}

