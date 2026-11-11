package CompendioParte1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class PanelEjercicio3 extends JPanel{
    JToggleButton tercerEjercicioBoton = new JToggleButton("Tercer Ejercicio");

    public PanelEjercicio3(){
        ActionListener listener = event -> {
            if (event.getSource() == tercerEjercicioBoton){
                //segundoEjercicioBoton.setVisible(!segundoEjercicioBoton.isVisible());
            }
        };

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        Box cabecera = Box.createHorizontalBox();
        this.add(cabecera);
        cabecera.add(tercerEjercicioBoton);
        cabecera.add(Box.createRigidArea(new Dimension(600, 90)));
        cabecera.setBorder(BorderFactory.createTitledBorder("Tercer Ejercicio"));

        tercerEjercicioBoton.addActionListener(listener);
    }
}
