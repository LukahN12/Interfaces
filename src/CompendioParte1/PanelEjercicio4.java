package CompendioParte1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class PanelEjercicio4 extends JPanel{
    JToggleButton cuartoEjercicioBoton = new JToggleButton("Cuarto Ejercicio");

    public PanelEjercicio4(){
        ActionListener listener = event -> {
            if (event.getSource() == cuartoEjercicioBoton){
                //segundoEjercicioBoton.setVisible(!segundoEjercicioBoton.isVisible());
            }
        };

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        Box cabecera = Box.createHorizontalBox();
        this.add(cabecera);
        cabecera.add(cuartoEjercicioBoton);
        cabecera.add(Box.createRigidArea(new Dimension(600, 90)));
        cabecera.setBorder(BorderFactory.createTitledBorder("Cuarto Ejercicio"));

        cuartoEjercicioBoton.addActionListener(listener);
    }
}
