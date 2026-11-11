package CompendioParte1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class PanelEjercicio2 extends JPanel{
    JToggleButton segundoEjercicioBoton = new JToggleButton("Segundo Ejercicio");

    public PanelEjercicio2(){

        Box ejercicio2 = Box.createHorizontalBox();
        Box contenido = Box.createHorizontalBox();

        ActionListener listener = event -> {
            if (event.getSource() == segundoEjercicioBoton){
                contenido.setVisible(!contenido.isVisible());
            }
        };

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        ejercicio2.add(segundoEjercicioBoton);

        ejercicio2.add(Box.createHorizontalStrut(10));

        ejercicio2.add(contenido);

        this.add(ejercicio2);

        ejercicio2.add(Box.createRigidArea(new Dimension(700, 100)));
        ejercicio2.setMaximumSize(ejercicio2.getPreferredSize());
        contenido.add(Box.createRigidArea(new Dimension(650, 80)));

        ejercicio2.setBorder(BorderFactory.createTitledBorder("Segundo Ejercicio"));
        contenido.setBorder(BorderFactory.createTitledBorder("contenido"));

        segundoEjercicioBoton.addActionListener(listener);
    }
}
