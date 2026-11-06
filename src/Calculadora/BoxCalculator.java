package Calculadora;

import javax.swing.*;
import java.awt.*;

public class BoxCalculator extends JPanel {
    public BoxCalculator(){
        JButton b1 = new JButton("7");
        JButton b2 = new JButton("8");
        JButton b3 = new JButton("9");
        JButton b4 = new JButton("/");
        JButton b5 = new JButton("4");
        JButton b6 = new JButton("5");
        JButton b7 = new JButton("6");
        JButton b8 = new JButton("*");
        JButton b9 = new JButton("1");
        JButton b10 = new JButton("2");
        JButton b11 = new JButton("3");
        JButton b12 = new JButton("-");
        JButton b13 = new JButton("0");
        JButton b14 = new JButton(".");
        JButton b15 = new JButton("=");
        JButton b16 = new JButton("+");

        Box cajaV = Box.createVerticalBox();

        Box cajaH1 = Box.createHorizontalBox(); // método factoría
        cajaH1.add(b1);
// separación horizontal de 10 pixeles
        cajaH1.add(Box.createRigidArea(new Dimension(5,5)));
        cajaH1.add(b2);
        cajaH1.add(Box.createRigidArea(new Dimension(5,5)));
// zona rígida, separación horizontal
        cajaH1.add(Box.createRigidArea(new Dimension(5,5)));
        cajaH1.add(b3);
        cajaH1.add(Box.createRigidArea(new Dimension(5,5)));
        cajaH1.add(b4);

        cajaV.add(Box.createRigidArea(new Dimension(5,5)));
        cajaV.add(cajaH1);

        Box cajaH2 = Box.createHorizontalBox(); // método factoría
        cajaH2.add(b5);
// separación horizontal de 10 pixeles
        cajaH2.add(Box.createRigidArea(new Dimension(5,5)));
        cajaH2.add(b6);
        cajaH2.add(Box.createRigidArea(new Dimension(5,5)));
// zona rígida, separación horizontal
        cajaH2.add(Box.createRigidArea(new Dimension(5,5)));
        cajaH2.add(b7);
        cajaH2.add(Box.createRigidArea(new Dimension(5,5)));
        cajaH2.add(b8);

        cajaV.add(Box.createRigidArea(new Dimension(5,5)));
        cajaV.add(cajaH2);

        Box cajaH3 = Box.createHorizontalBox();
        cajaH3.add(b9);
// separación horizontal de 10 pixeles
        cajaH3.add(Box.createRigidArea(new Dimension(5,5)));
        cajaH3.add(b10);
        cajaH3.add(Box.createRigidArea(new Dimension(5,5)));
// zona rígida, separación horizontal
        cajaH3.add(Box.createRigidArea(new Dimension(5,5)));
        cajaH3.add(b11);
        cajaH3.add(Box.createRigidArea(new Dimension(5,5)));
        cajaH3.add(b12);

        cajaV.add(Box.createRigidArea(new Dimension(5,5)));
        cajaV.add(cajaH3);

        Box cajaH4 = Box.createHorizontalBox(); // método factoría
        cajaH4.add(b13);
// separación horizontal de 10 pixeles
        cajaH4.add(Box.createRigidArea(new Dimension(5,5)));
        cajaH4.add(b14);
        cajaH4.add(Box.createRigidArea(new Dimension(5,5)));
// zona rígida, separación horizontal
        cajaH4.add(Box.createRigidArea(new Dimension(5,5)));
        cajaH4.add(b15);
        cajaH4.add(Box.createRigidArea(new Dimension(5,5)));
        cajaH4.add(b16);

        cajaV.add(Box.createRigidArea(new Dimension(5,5)));
        cajaV.add(cajaH4);

        cajaV.add(Box.createRigidArea(new Dimension(5,5)));

        this.add(cajaV,BorderLayout.CENTER);

    }
}
