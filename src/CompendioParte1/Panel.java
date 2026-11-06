package CompendioParte1;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    public Panel(){
        JLabel titulo = new JLabel("IES ALANDALUS");

        Box cajaV = Box.createVerticalBox();

        Box cajaH = Box.createHorizontalBox(); // método factoría
        cajaH.add(titulo);

        cajaH.add(Box.createRigidArea(new Dimension(60, 10)));

        cajaV.add(cajaH);
        cajaV.add(Box.createRigidArea(new Dimension(200, 60)));

        cajaH.setBorder(BorderFactory.createTitledBorder("Columna"));
        cajaV.setBorder(BorderFactory.createTitledBorder("Fila"));

        this.add(cajaH,BorderLayout.NORTH);
        this.add(cajaV,BorderLayout.CENTER);
    }
}
