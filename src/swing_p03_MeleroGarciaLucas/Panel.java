package swing_p03_MeleroGarciaLucas;

import javax.swing.*;
import java.awt.*;

public class Panel extends JLabel {
    private JButton botonEnviar;
    private JToggleButton botonMostrar;
    private JPasswordField contraseña;
    private JTextField campoNombre;
    private JTextField campoCorreo;
    private JTextField CampoTelefono;
    private JLabel usuario;
    private JLabel correo;
    private JLabel telefono;
    private JLabel contrasenna;
    private JLabel datosEnviados;

    public Panel() {
        this.setLayout(null);
        Color fondoColor = new Color(239,216,215);
        this.setOpaque(true);
        usuario = new JLabel();
        usuario.setText("Usuario (&U): ");
        usuario.setFont(new Font("ComicSansMS",Font.BOLD,12));
        usuario.setBounds(10,25,200,25);

        this.add(usuario);

        campoNombre = new JTextField();
        campoNombre.setBounds(120,25,320,25);

        this.add(campoNombre);

        correo = new JLabel();
        correo.setText("Correo (&C): ");
        correo.setFont(new Font("ComicSansMS",Font.BOLD,12));
        correo.setBounds(10,70,200,25);

        this.add(correo);

        campoNombre = new JTextField();
        campoNombre.setBounds(120,70,320,25);

        this.add(campoNombre);

    }

//    public boolean Validar(){
//
//    }
}

