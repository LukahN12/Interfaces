package CompendioParte1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class PanelGeneral extends JPanel {

    public PanelGeneral(){

        // Es mejor cambiarlo por un grid de 1 sola columna

        Box ColumnaPrincipal = Box.createVerticalBox();
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.add(ColumnaPrincipal);
        ColumnaPrincipal.add(new PanelCabecera());
        ColumnaPrincipal.add(new PanelEjercicio1());
        ColumnaPrincipal.add(new PanelEjercicio2());
        ColumnaPrincipal.add(new PanelEjercicio3());
        ColumnaPrincipal.add(new PanelEjercicio4());
        ColumnaPrincipal.add(new PanelEjercicio5());
    }

}
