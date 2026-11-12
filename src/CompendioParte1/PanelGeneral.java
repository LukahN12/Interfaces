package CompendioParte1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class PanelGeneral extends JPanel{
    JButton actividadesActivas = new JButton("Actividades Activas");
    PanelEjercicio1 panelEjercicio1 = new PanelEjercicio1();
    PanelEjercicio2 panelEjercicio2 = new PanelEjercicio2();
    PanelEjercicio3 panelEjercicio3 = new PanelEjercicio3();
    PanelEjercicio4 panelEjercicio4 = new PanelEjercicio4();
    PanelEjercicio5 panelEjercicio5 = new PanelEjercicio5();

    public PanelGeneral(){

        ActionListener listener = event -> {
            if (event.getSource() == actividadesActivas){
                int valorTotal = ( panelEjercicio1.getVisibility() + panelEjercicio2.getVisibility() + panelEjercicio3.getVisibility() + panelEjercicio4.getVisibility() + panelEjercicio5.getVisibility());
                JOptionPane.showMessageDialog(null, "Actualmente tienes " + valorTotal + " actividades activas", "Actividades Activas", JOptionPane.INFORMATION_MESSAGE);
            }
        };

        JPanel panelBoton = new JPanel();

        actividadesActivas.setPreferredSize(new Dimension(160,40));

        panelBoton.add(actividadesActivas);

        this.setLayout(new GridLayout(7,1));
        this.add(new PanelCabecera());
        this.add(panelEjercicio1);
        this.add(panelEjercicio2);
        this.add(panelEjercicio3);
        this.add(panelEjercicio4);
        this.add(panelEjercicio5);
        this.add(panelBoton);


        actividadesActivas.addActionListener(listener);
    }

}
