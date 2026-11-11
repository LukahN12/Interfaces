package CompendioParte1;

import javax.swing.*;
import java.awt.*;

public class PanelCabecera  extends JPanel {
    JLabel titulo = new JLabel("IES ALANDALUS");

    public PanelCabecera(){
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        Box cabecera = Box.createHorizontalBox();

        // titulo.setAlignmentY(Component.CENTER_ALIGNMENT);

        cabecera.add(Box.createHorizontalGlue());
        cabecera.add(titulo);
        //cabecera.add(Box.createHorizontalGlue());
        cabecera.add(Box.createRigidArea(new Dimension(600, 80)));

        cabecera.setBorder(BorderFactory.createTitledBorder("cabecera"));

        this.add(cabecera);
    }

}
