package CompendioParte1;

import javax.swing.*;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionListener;

public class PanelEjercicio4 extends JPanel{
    JToggleButton cuartoEjercicioBoton = new JToggleButton("Cuarto Ejercicio");
    JLabel Quijote = new JLabel("En un lugar de la mancha, de cuyo nombre");
    JSlider deslizador = new JSlider(SwingConstants.HORIZONTAL,5,25,15);
    Box modifiers;

    public PanelEjercicio4(){

        Box ejercicio4 = Box.createHorizontalBox();
        Box contenido = Box.createHorizontalBox();
        modifiers = Box.createVerticalBox();

        ActionListener listener = event -> {
            if (event.getSource() == cuartoEjercicioBoton){
                modifiers.setVisible(!modifiers.isVisible());
            }
        };

        ChangeListener changeListener = change -> {
            if(change.getSource()==deslizador) {
                int valor=(int) deslizador.getValue();
                Quijote.setFont(new Font(Quijote.getFont().getName(), Font.BOLD, valor));
            }
        };

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        modifiers.add(deslizador);
        modifiers.add(contenido);
        contenido.add(Quijote);

        modifiers.setVisible(false);

        this.add(modifiers);

        ejercicio4.add(cuartoEjercicioBoton);

        ejercicio4.add(Box.createHorizontalStrut(10));

        ejercicio4.add(modifiers);

        this.add(ejercicio4);

        ejercicio4.add(Box.createRigidArea(new Dimension(700, 90)));
        ejercicio4.setMaximumSize(ejercicio4.getPreferredSize());
        modifiers.add(Box.createRigidArea(new Dimension(650, 80)));

        modifiers.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        cuartoEjercicioBoton.addActionListener(listener);
        deslizador.addChangeListener(changeListener);
    }
    public int getVisibility(){
        int result = 0;
        if (modifiers.isVisible()){
            result = 1;
        }
        return result;
    }
}
