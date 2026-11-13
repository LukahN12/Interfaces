package Eventos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel4Eventos extends JPanel implements ActionListener {

    private JButton botonAzul,botonAmarillo,botonRojo;

    public Panel4Eventos(){
        botonAzul = new JButton("Azul");
        botonAmarillo = new JButton("Amarillo");
        botonRojo = new JButton("Rojo");

        this.add(botonAzul);
        this.add(botonAmarillo);
        this.add(botonRojo);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
