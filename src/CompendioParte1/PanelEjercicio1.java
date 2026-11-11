package CompendioParte1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class PanelEjercicio1 extends JPanel {
    JToggleButton primerEjercicioBoton = new JToggleButton("Primer Ejercicio");

    public PanelEjercicio1(){

        Box ejercicio1 = Box.createHorizontalBox();
        Box contenido = Box.createHorizontalBox();

        ActionListener listener = event -> {
            if (event.getSource() == primerEjercicioBoton){
                contenido.setVisible(!contenido.isVisible());
            }
        };

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        Box.createHorizontalGlue();
        this.add(contenido);

        ejercicio1.add(primerEjercicioBoton);

        ejercicio1.add(Box.createHorizontalStrut(10));

        ejercicio1.add(contenido);

        Box.createHorizontalGlue();
        this.add(ejercicio1);

        ejercicio1.add(Box.createRigidArea(new Dimension(700, 90)));
        ejercicio1.setMaximumSize(ejercicio1.getPreferredSize());
        contenido.add(Box.createRigidArea(new Dimension(650,80)));

        ejercicio1.setBorder(BorderFactory.createTitledBorder("Primer Ejercicio"));
        contenido.setBorder(BorderFactory.createTitledBorder("contenido"));

        primerEjercicioBoton.addActionListener(listener);
    }
}
