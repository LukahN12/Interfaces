package CompendioParte1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class PanelEjercicio5 extends JPanel{
    JToggleButton quintoEjercicioBoton = new JToggleButton("Quinto Ejercicio");

    public PanelEjercicio5(){
        ActionListener listener = event -> {
            if (event.getSource() == quintoEjercicioBoton){
                //segundoEjercicioBoton.setVisible(!segundoEjercicioBoton.isVisible());
            }
        };

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        Box cabecera = Box.createHorizontalBox();
        this.add(cabecera);
        cabecera.add(quintoEjercicioBoton);
        cabecera.add(Box.createRigidArea(new Dimension(600, 90)));
        cabecera.setBorder(BorderFactory.createTitledBorder("Quinto Ejercicio"));

        quintoEjercicioBoton.addActionListener(listener);
    }
}
