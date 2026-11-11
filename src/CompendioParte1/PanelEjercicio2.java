package CompendioParte1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class PanelEjercicio2 extends JPanel{
    JToggleButton segundoEjercicioBoton = new JToggleButton("Segundo Ejercicio");

    public PanelEjercicio2(){
        ActionListener listener = event -> {
            if (event.getSource() == segundoEjercicioBoton){
                //segundoEjercicioBoton.setVisible(!segundoEjercicioBoton.isVisible());
            }
        };

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        Box cabecera = Box.createHorizontalBox();
        this.add(cabecera);
        cabecera.add(segundoEjercicioBoton);
        cabecera.add(Box.createRigidArea(new Dimension(600, 90)));
        cabecera.setBorder(BorderFactory.createTitledBorder("Segundo Ejercicio"));

        segundoEjercicioBoton.addActionListener(listener);
    }
}
