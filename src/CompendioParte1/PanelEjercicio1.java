package CompendioParte1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class PanelEjercicio1 extends JPanel {
    JToggleButton primerEjercicioBoton = new JToggleButton("Primer Ejercicio");
    JLabel Quijote = new JLabel("En un lugar de la mancha, de cuyo nombre");
    JCheckBox Modifier1 = new JCheckBox("Negrita");
    JCheckBox Modifier2 = new JCheckBox("Cursiva");
    Box modifiers;

    public PanelEjercicio1() {

        Box ejercicio1 = Box.createHorizontalBox();
        Box contenido = Box.createHorizontalBox();
        modifiers = Box.createVerticalBox();

        ActionListener listener = event -> {
            if (event.getSource() == primerEjercicioBoton) {
                modifiers.setVisible(!modifiers.isVisible());
            }

            if (comprobador() == 1){
                Quijote.setFont(new Font(Quijote.getFont().getName(), Font.BOLD, Quijote.getFont().getSize()));
            }
            if (comprobador() == 2){
                Quijote.setFont(new Font(Quijote.getFont().getName(), Font.ITALIC, Quijote.getFont().getSize()));
            }
            if (comprobador() == 3){
                Quijote.setFont(new Font(Quijote.getFont().getName(), Font.BOLD | Font.ITALIC, Quijote.getFont().getSize()));
            }
        };

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        modifiers.add(Quijote);
        modifiers.add(contenido);
        contenido.add(Modifier1);
        contenido.add(Modifier2);

        modifiers.setVisible(false);

        this.add(modifiers);

        ejercicio1.add(primerEjercicioBoton);

        ejercicio1.add(Box.createHorizontalStrut(10));

        ejercicio1.add(modifiers);

        this.add(ejercicio1);

        ejercicio1.add(Box.createRigidArea(new Dimension(700, 90)));
        ejercicio1.setMaximumSize(ejercicio1.getPreferredSize());
        modifiers.add(Box.createRigidArea(new Dimension(650, 80)));

        modifiers.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        contenido.setVisible(!contenido.isVisible());

        primerEjercicioBoton.addActionListener(listener);
        Modifier1.addActionListener(listener);
        Modifier2.addActionListener(listener);
    }

    private int comprobador() {
        int respuesta = 0;
        if (Modifier1.isSelected()) {
            respuesta = 1;
        }
        if (Modifier2.isSelected()) {
            respuesta = 2;
        }
        if (Modifier1.isSelected() && Modifier2.isSelected()){
            respuesta = 3;
        }

        return respuesta;
    }

    public int getVisibility(){
        int result = 0;
        if (modifiers.isVisible()){
            result = 1;
        }
        return result;
    }
}
