package CompendioParte1;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionListener;

public class PanelEjercicio5 extends JPanel{
    JToggleButton quintoEjercicioBoton = new JToggleButton("Quinto Ejercicio");
    JLabel Quijote = new JLabel("¿Cuantas imagenes quieres mostrar?");
    SpinnerNumberModel modelo = new SpinnerNumberModel(0, 0, 4, 1);
    JSpinner spinner = new JSpinner(modelo);
    ImageIcon imagenIcon1, imagenIcon2, imagenIcon3,imagenIcon4;
    JLabel imagen1,imagen2,imagen3,imagen4;
    Box modifiers;

    public PanelEjercicio5(){

        Box ejercicio5 = Box.createHorizontalBox();
        Box contenido = Box.createHorizontalBox();
        modifiers = Box.createVerticalBox();

        imagenIcon1=new ImageIcon("C:\\Users\\neon2\\IdeaProjects\\Interfaces\\src\\Recursos\\94d4590d97a6a882cf33f9e1e4fe513d.jpg");
        Image versionEscalada1 = imagenIcon1.getImage().getScaledInstance(75,75,Image.SCALE_SMOOTH);
        imagenIcon1 = new ImageIcon(versionEscalada1);
        imagenIcon2=new ImageIcon("C:\\Users\\neon2\\IdeaProjects\\Interfaces\\src\\Recursos\\cuervo.jpg");
        Image versionEscalada2 = imagenIcon2.getImage().getScaledInstance(75,75,Image.SCALE_SMOOTH);
        imagenIcon2 = new ImageIcon(versionEscalada2);
        imagenIcon3=new ImageIcon("C:\\Users\\neon2\\IdeaProjects\\Interfaces\\src\\Recursos\\dc5c1531665d0c2618623c563126c8a3.jpg");
        Image versionEscalada3 = imagenIcon3.getImage().getScaledInstance(75,75,Image.SCALE_SMOOTH);
        imagenIcon3 = new ImageIcon(versionEscalada3);
        imagenIcon4 =new ImageIcon("C:\\Users\\neon2\\IdeaProjects\\Interfaces\\src\\Recursos\\8a88bbb0cb59859fdfaa4c26d729b33e.jpg");
        Image versionEscalada4 = imagenIcon4.getImage().getScaledInstance(75,75,Image.SCALE_SMOOTH);
        imagenIcon4 = new ImageIcon(versionEscalada4);

        imagen1 = new JLabel(imagenIcon1);
        imagen2 = new JLabel(imagenIcon2);
        imagen3 = new JLabel(imagenIcon3);
        imagen4 = new JLabel(imagenIcon4);


        ActionListener listener = event -> {
            if (event.getSource() == quintoEjercicioBoton){
                modifiers.setVisible(!modifiers.isVisible());
            }
        };

        ChangeListener changer = event -> {
            if (event.getSource() == spinner) {
                int valor = (int) spinner.getValue();
                if (valor == 1) {
                    imagen1.setVisible(true);
                    imagen2.setVisible(false);
                    imagen3.setVisible(false);
                    imagen4.setVisible(false);
                } else if (valor == 2) {
                    imagen1.setVisible(true);
                    imagen2.setVisible(true);
                    imagen3.setVisible(false);
                    imagen4.setVisible(false);
                } else if (valor == 3) {
                    imagen1.setVisible(true);
                    imagen2.setVisible(true);
                    imagen3.setVisible(true);
                    imagen4.setVisible(false);
                } else if (valor == 4){
                    imagen1.setVisible(true);
                    imagen2.setVisible(true);
                    imagen3.setVisible(true);
                    imagen4.setVisible(true);
                } else {
                    imagen1.setVisible(false);
                    imagen2.setVisible(false);
                    imagen3.setVisible(false);
                    imagen4.setVisible(false);
                }
            }
        };

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        modifiers.add(Quijote);
        modifiers.add(spinner);
        modifiers.add(contenido);
        contenido.add(imagen1);
        imagen1.setVisible(false);
        contenido.add(imagen2);
        imagen2.setVisible(false);
        contenido.add(imagen3);
        imagen3.setVisible(false);
        contenido.add(imagen4);
        imagen4.setVisible(false);

        modifiers.setVisible(false);

        this.add(modifiers);

        ejercicio5.add(quintoEjercicioBoton);

        ejercicio5.add(Box.createHorizontalStrut(10));

        ejercicio5.add(modifiers);

        this.add(ejercicio5);

        ejercicio5.add(Box.createRigidArea(new Dimension(700, 90)));
        ejercicio5.setMaximumSize(ejercicio5.getPreferredSize());
        modifiers.add(Box.createRigidArea(new Dimension(650, 80)));

        modifiers.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        quintoEjercicioBoton.addActionListener(listener);
        spinner.addChangeListener(changer);
    }
    public int getVisibility(){
        int result = 0;
        if (modifiers.isVisible()){
            result = 1;
        }
        return result;
    }
}