package CompendioParte1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class PanelEjercicio3 extends JPanel{
    JToggleButton tercerEjercicioBoton = new JToggleButton("Tercer Ejercicio");
    JLabel Quijote = new JLabel("En un lugar de la mancha, de cuyo nombre");
    JRadioButton Modifier1 = new JRadioButton("Pequenno");
    JRadioButton Modifier2 = new JRadioButton("Mediano");
    JRadioButton Modifier3 = new JRadioButton("Grande");
    JRadioButton Modifier4 = new JRadioButton("MUY GRANDE");
    ButtonGroup grupoRadios = new ButtonGroup();
    Box modifiers;

    public PanelEjercicio3(){

        Box ejercicio3 = Box.createHorizontalBox();
        Box contenido = Box.createHorizontalBox();
        modifiers = Box.createVerticalBox();

        ActionListener listener = event -> {
            if (event.getSource() == tercerEjercicioBoton) {
                modifiers.setVisible(!modifiers.isVisible());
            }

            if (comprobador() == 1){
                Quijote.setFont(new Font(Quijote.getFont().getName(), Font.BOLD, 1));
            }
            if (comprobador() == 2){
                Quijote.setFont(new Font(Quijote.getFont().getName(), Font.BOLD, 10));
            }
            if (comprobador() == 3){
                Quijote.setFont(new Font(Quijote.getFont().getName(), Font.BOLD,20));
            }
            if (comprobador() == 4){
                Quijote.setFont(new Font(Quijote.getFont().getName(), Font.BOLD, 30));
            }
        };

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        grupoRadios.add(Modifier1);
        grupoRadios.add(Modifier2);
        grupoRadios.add(Modifier3);
        grupoRadios.add(Modifier4);

        modifiers.add(Quijote);
        modifiers.add(contenido);
        contenido.add(Modifier1);
        contenido.add(Modifier2);
        contenido.add(Modifier3);
        contenido.add(Modifier4);

        modifiers.setVisible(false);

        this.add(modifiers);

        ejercicio3.add(tercerEjercicioBoton);

        ejercicio3.add(Box.createHorizontalStrut(10));

        ejercicio3.add(modifiers);

        this.add(ejercicio3);

        ejercicio3.add(Box.createRigidArea(new Dimension(700, 90)));
        ejercicio3.setMaximumSize(ejercicio3.getPreferredSize());
        modifiers.add(Box.createRigidArea(new Dimension(650, 80)));

        modifiers.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        contenido.setVisible(!contenido.isVisible());

        tercerEjercicioBoton.addActionListener(listener);
        Modifier1.addActionListener(listener);
        Modifier2.addActionListener(listener);
        Modifier3.addActionListener(listener);
        Modifier4.addActionListener(listener);
    }

    private int comprobador() {
        int respuesta = 0;
        if (Modifier1.isSelected()) {
            respuesta = 1;
        }
        if (Modifier2.isSelected()) {
            respuesta = 2;
        }
        if (Modifier3.isSelected()){
            respuesta = 3;
        }
        if (Modifier4.isSelected()){
            respuesta = 4;
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
