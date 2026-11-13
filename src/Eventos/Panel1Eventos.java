package Eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel1Eventos extends JPanel {

        private JButton botonAzul,botonAmarillo,botonRojo;
        private ColorFondo fondoAzul;

    public Panel1Eventos() {
         botonAzul = new JButton("Azul");
         botonAmarillo = new JButton("Amarillo");
         botonRojo = new JButton("Rojo");

        fondoAzul = new ColorFondo(Color.BLUE);

        botonAzul.addActionListener(fondoAzul);
        botonAmarillo.addActionListener(new ColorFondo(Color.YELLOW));
        botonRojo.addActionListener(new ColorFondo(Color.RED));

         this.add(botonAzul);
         this.add(botonAmarillo);
         this.add(botonRojo);
    }

    private class ColorFondo implements ActionListener{

            private  Color colorF;

            public ColorFondo(Color c) {
                    colorF = c;
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                    setBackground(colorF);
            }
    }
}

