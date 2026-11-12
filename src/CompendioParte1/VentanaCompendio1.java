package CompendioParte1;

import javax.swing.*;

public class VentanaCompendio1 extends JFrame{
    public VentanaCompendio1(){
        super("Compendio parte 1");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(50, 50, 600, 600);

        PanelGeneral miPanel = new PanelGeneral();
        this.add(miPanel);
        this.pack();
        this.setVisible(true);
    }
}
