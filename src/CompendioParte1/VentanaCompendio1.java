package CompendioParte1;

import javax.swing.*;

public class VentanaCompendio1 extends JFrame{
    public VentanaCompendio1(){
        super("Compendio parte 1");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(50, 50, 600, 450);

        Panel miPanel = new Panel();
        miPanel.setBorder(BorderFactory.createTitledBorder("PanelSimpleFlowLayout"));
        this.add(miPanel);
        this.setVisible(true);
    }
}
