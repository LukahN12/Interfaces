package Eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel2Eventos extends JPanel implements ActionListener {

    private JButton botonAzul,botonAmarillo,botonRojo;

    public Panel2Eventos(){
        botonAzul = new JButton("Azul");
        botonAmarillo = new JButton("Amarillo");
        botonRojo = new JButton("Rojo");

        botonAzul.addActionListener(this );
        botonAmarillo.addActionListener(this);
        botonRojo.addActionListener(this);

        this.add(botonAzul);
        this.add(botonAmarillo);
        this.add(botonRojo);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object botonPulsado = e.getSource();
        if (botonPulsado == botonAzul){
            setBackground(Color.BLUE);
        }
        else if (botonPulsado == botonAmarillo){
            setBackground(Color.YELLOW);
        }
        else if (botonPulsado == botonRojo){
            setBackground(Color.RED);
        }
    }
}
