package CompendioParte1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class PanelEjercicio5 extends JPanel{
    JToggleButton quintoEjercicioBoton = new JToggleButton("Quinto Ejercicio");

    public PanelEjercicio5(){

        Box ejercicio5 = Box.createHorizontalBox();
        Box contenido = Box.createHorizontalBox();

        ActionListener listener = event -> {
            if (event.getSource() == quintoEjercicioBoton){
                contenido.setVisible(!contenido.isVisible());
            }
        };

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        ejercicio5.add(quintoEjercicioBoton);

        ejercicio5.add(Box.createHorizontalStrut(10));

        ejercicio5.add(contenido);

        this.add(ejercicio5);

        ejercicio5.add(Box.createRigidArea(new Dimension(700, 100)));
        ejercicio5.setMaximumSize(ejercicio5.getPreferredSize());
        contenido.add(Box.createRigidArea(new Dimension(650, 80)));

        ejercicio5.setBorder(BorderFactory.createTitledBorder("Quinto Ejercicio"));
        contenido.setBorder(BorderFactory.createTitledBorder("contenido"));

        quintoEjercicioBoton.addActionListener(listener);
    }
}
