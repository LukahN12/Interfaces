package CompendioParte1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class PanelEjercicio2 extends JPanel{
    JToggleButton segundoEjercicioBoton = new JToggleButton("Segundo Ejercicio");
    JLabel Quijote = new JLabel("En un lugar de la mancha, de cuyo nombre");
    JComboBox<String> combo;
    Box modifiers;

    public PanelEjercicio2(){

        Box ejercicio2 = Box.createHorizontalBox();
        Box contenido = Box.createHorizontalBox();
        modifiers = Box.createVerticalBox();

        ActionListener listener = event -> {
            if (event.getSource() == segundoEjercicioBoton){
                modifiers.setVisible(!modifiers.isVisible());
            }

            switch (comboResult()) {
                case 1 -> Quijote.setFont(new Font(Font.SERIF, Font.BOLD, Quijote.getFont().getSize()));
                case 2 -> Quijote.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, Quijote.getFont().getSize()));
                case 3 -> Quijote.setFont(new Font(Font.MONOSPACED, Font.BOLD, Quijote.getFont().getSize()));
            }
        };

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        String[] opciones= {"Serif", "Dialog", "Monospaced"};
        combo = new JComboBox<>(opciones);
        combo.setBounds(430, 50, 100, 23);
        combo.setSelectedItem("Serif");

        modifiers.add(combo);
        modifiers.add(contenido);
        contenido.add(Quijote);

        modifiers.setVisible(false);

        this.add(modifiers);

        ejercicio2.add(segundoEjercicioBoton);

        ejercicio2.add(Box.createHorizontalStrut(10));

        ejercicio2.add(modifiers);

        this.add(ejercicio2);

        ejercicio2.add(Box.createRigidArea(new Dimension(700, 90)));
        ejercicio2.setMaximumSize(ejercicio2.getPreferredSize());
        modifiers.add(Box.createRigidArea(new Dimension(650, 80)));

        modifiers.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        contenido.setVisible(!contenido.isVisible());

        segundoEjercicioBoton.addActionListener(listener);
        combo.addActionListener(listener);
    }

    private int comboResult(){
        return combo.getSelectedIndex();
    }
    public int getVisibility(){
        int result = 0;
        if (modifiers.isVisible()){
            result = 1;
        }
        return result;
    }
}
