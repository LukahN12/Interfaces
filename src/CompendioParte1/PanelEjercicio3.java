package CompendioParte1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class PanelEjercicio3 extends JPanel{
    JToggleButton tercerEjercicioBoton = new JToggleButton("Tercer Ejercicio");

    public PanelEjercicio3(){

        Box ejercicio3 = Box.createHorizontalBox();
        Box contenido = Box.createHorizontalBox();

        ActionListener listener = event -> {
            if (event.getSource() == tercerEjercicioBoton){
                contenido.setVisible(!contenido.isVisible());
            }
        };

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        ejercicio3.add(tercerEjercicioBoton);

        ejercicio3.add(Box.createHorizontalStrut(10));

        ejercicio3.add(contenido);

        this.add(ejercicio3);

        ejercicio3.add(Box.createRigidArea(new Dimension(700, 100)));
        ejercicio3.setMaximumSize(ejercicio3.getPreferredSize());
        contenido.add(Box.createRigidArea(new Dimension(650, 80)));

        ejercicio3.setBorder(BorderFactory.createTitledBorder("Tercer Ejercicio"));
        contenido.setBorder(BorderFactory.createTitledBorder("contenido"));

        tercerEjercicioBoton.addActionListener(listener);
    }
}
