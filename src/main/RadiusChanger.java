package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class RadiusChanger {
    PaintPanel pp;
    ButtonPanel bp;
    Graphics2D g2;

    public JButton button = new JButton();
    JPanel radiusWindow = new JPanel();


//constructor
public RadiusChanger(ButtonPanel bp , PaintPanel pp) {
    this.bp = bp;
    this.pp = pp;

    radiusButton();
    radiusWindow();
}

    //create method
    public void draw(Graphics2D g2) {
        this.g2 = g2; //to use g2 in other methods in this class

    }

//method
public void radiusButton() {

    button.setOpaque(false); // button transparent
    button.setContentAreaFilled(false); // keine gefüllte Hintergrundfläche
    button.setFocusPainted(true); // Entfernt den Fokus-Rahmen
    button.setBounds(25, 200, 200, 40);
    button.setText("STROKESIZE");
    button.setFocusable(false);
    button.setHorizontalTextPosition(JButton.CENTER);
    button.setBackground(Color.gray);
    button.setFont(new Font("Arial",Font.BOLD,25));

    for (ActionListener al : button.getActionListeners()) {
        button.removeActionListener(al);
    }

    button.addActionListener(e -> {
        boolean isVisible = radiusWindow.isVisible();
        radiusWindow.setVisible(!isVisible); //Sichtbarkeit umschalten
        System.out.println(isVisible ? "window closed" : "window opened");

    });

    bp.add(button);

}

    // method
    public void radiusWindow() {

        radiusWindow.setBounds(25, 250, 200, 40);
        radiusWindow.setLayout(new GridLayout(1, 6));
        radiusWindow.setBackground(Color.black);
        radiusWindow.setFont(new Font("Arial", Font.BOLD, 16));

        JButton six = new JButton("6");
        six.setBackground(Color.gray);
        six.addActionListener(e -> {
            if (pp.mouseH != null) {
                pp.mouseH.setSTROKE_SIZE(6);
            }
        });

        JButton eight = new JButton("8");
        eight.setBackground(Color.gray);
        eight.addActionListener(e -> {
            if (pp.mouseH != null) {
                pp.mouseH.setSTROKE_SIZE(8);
            }
        });

        JButton ten = new JButton("10");
        ten.setBackground(Color.gray);
        ten.addActionListener(e -> {
            if (pp.mouseH != null) {
                pp.mouseH.setSTROKE_SIZE(10);
            }
        });

        JButton twelve = new JButton("12");
        twelve.setBackground(Color.gray);
        twelve.addActionListener(e -> {
            if (pp.mouseH != null) {
                pp.mouseH.setSTROKE_SIZE(12);
            }
        });

        JButton fourteen = new JButton("14");
        fourteen.setBackground(Color.gray);
        fourteen.addActionListener(e -> {
            if (pp.mouseH != null) {
                pp.mouseH.setSTROKE_SIZE(14);
            }
        });

        JButton sixteen = new JButton("16");
        sixteen.setBackground(Color.gray);
        sixteen.addActionListener(e -> {
            if (pp.mouseH != null) {
                pp.mouseH.setSTROKE_SIZE(16);
            }

        });

        radiusWindow.add(six);
        radiusWindow.add(eight);
        radiusWindow.add(ten);
        radiusWindow.add(twelve);
        radiusWindow.add(fourteen);
        radiusWindow.add(sixteen);

        radiusWindow.setVisible(false);

        bp.add(radiusWindow);

    }

}