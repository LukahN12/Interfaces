package CompendioParte1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class PanelEjercicio1 extends JPanel {
    JToggleButton primerEjercicioBoton = new JToggleButton("Primer Ejercicio");

    public PanelEjercicio1(){
        ActionListener listener = event -> {
            if (event.getSource() == primerEjercicioBoton){
                //segundoEjercicioBoton.setVisible(!segundoEjercicioBoton.isVisible());
            }
        };

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        Box ejercicio1 = Box.createHorizontalBox();
        Box contenido = Box.createHorizontalBox();

        this.add(contenido);

        ejercicio1.add(primerEjercicioBoton);

        ejercicio1.add(Box.createHorizontalStrut(10));

        ejercicio1.add(contenido);

        this.add(ejercicio1);

        ejercicio1.add(Box.createRigidArea(new Dimension(600, 90)));

        // ejercicio1.setBorder(BorderFactory.createTitledBorder("Primer Ejercicio"));
        contenido.setBorder(BorderFactory.createTitledBorder("contenido"));

        primerEjercicioBoton.addActionListener(listener);
    }
}
