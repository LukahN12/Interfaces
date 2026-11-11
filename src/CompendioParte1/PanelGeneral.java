package CompendioParte1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class PanelGeneral extends JPanel {

    public PanelGeneral(){
        this.setLayout(new GridLayout(7,1));
        this.add(new PanelCabecera());
        this.add(new PanelEjercicio1());
        this.add(new PanelEjercicio2());
        this.add(new PanelEjercicio3());
        this.add(new PanelEjercicio4());
        this.add(new PanelEjercicio5());
    }

}
