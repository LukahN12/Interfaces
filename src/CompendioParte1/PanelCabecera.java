package CompendioParte1;

import javax.swing.*;
import java.awt.*;

public class PanelCabecera  extends JPanel {
    JLabel titulo = new JLabel("IES ALANDALUS");

    public PanelCabecera(){
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        Box cabecera = Box.createHorizontalBox();
        this.add(cabecera);
        cabecera.add(titulo);
        cabecera.add(Box.createRigidArea(new Dimension(600, 90)));
        cabecera.setBorder(BorderFactory.createTitledBorder("cabecera"));
    }

}
