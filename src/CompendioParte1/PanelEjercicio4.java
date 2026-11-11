package CompendioParte1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class PanelEjercicio4 extends JPanel{
    JToggleButton cuartoEjercicioBoton = new JToggleButton("Cuarto Ejercicio");

    public PanelEjercicio4(){

        Box ejercicio4 = Box.createHorizontalBox();
        Box contenido = Box.createHorizontalBox();

        ActionListener listener = event -> {
            if (event.getSource() == cuartoEjercicioBoton){
                contenido.setVisible(!contenido.isVisible());
            }
        };

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        ejercicio4.add(cuartoEjercicioBoton);

        ejercicio4.add(Box.createHorizontalStrut(10));

        ejercicio4.add(contenido);

        this.add(ejercicio4);

        ejercicio4.add(Box.createRigidArea(new Dimension(700, 100)));
        ejercicio4.setMaximumSize(ejercicio4.getPreferredSize());
        contenido.add(Box.createRigidArea(new Dimension(650, 80)));

        ejercicio4.setBorder(BorderFactory.createTitledBorder("Cuarto Ejercicio"));
        contenido.setBorder(BorderFactory.createTitledBorder("contenido"));

        cuartoEjercicioBoton.addActionListener(listener);
    }
}
