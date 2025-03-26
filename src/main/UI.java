package main;

import javax.swing.*;
import java.awt.*;
//import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI {

    PaintPanel pp;
    ButtonPanel bp;
    Graphics2D g2;

    public JButton button = new JButton();
    JPanel colorWindow = new JPanel();



    //constructor
    public UI(ButtonPanel bp , PaintPanel pp) {
        this.bp = bp;
        this.pp = pp;

        colorButton();

        colorWindow();

    }


    //create method
    public void draw(Graphics2D g2) {
        this.g2 = g2; //to use g2 in other methods in this class

    }

    //method
    public void colorButton() {

        button.setOpaque(false); // button transparent
        button.setContentAreaFilled(false); // keine gefüllte Hintergrundfläche
        button.setFocusPainted(true); // Entfernt den Fokus-Rahmen
        button.setBounds(25, 50, 200, 40);
        button.setText("COLOR >");
        button.setFocusable(false);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setBackground(Color.gray);
        button.setFont(new Font("Arial",Font.BOLD,25));

        for (ActionListener al : button.getActionListeners()) {
            button.removeActionListener(al);
        }

        button.addActionListener(e -> {
           boolean isVisible = colorWindow.isVisible();
           colorWindow.setVisible(!isVisible); //Sichtbarkeit umschalten
            System.out.println(isVisible ? "window closed" : "window opened");

        });

        bp.add(button);

    }


    // method
    public void colorWindow() {

        colorWindow.setBounds(25, 100, 200, 150);
        colorWindow.setLayout(new GridLayout(2, 3));
        colorWindow.setBackground(Color.black);
        colorWindow.setFont(new Font("Arial", Font.BOLD, 16));

        JButton red = new JButton("RED");
        red.setBackground(Color.red);
        red.addActionListener(e -> {
            if (pp.mouseH != null) {
                pp.mouseH.setColor(Color.RED);
            }
        });

        JButton green = new JButton("GREEN");
        green.setBackground(Color.green);
        green.addActionListener(e -> {
            if (pp.mouseH != null) {
                pp.mouseH.setColor(Color.GREEN);
            }
        });

        JButton blue = new JButton("BLUE");
        blue.setBackground(Color.blue);
        blue.addActionListener(e -> {
            if (pp.mouseH != null) {
                pp.mouseH.setColor(Color.BLUE);
            }
        });

        JButton yellow = new JButton("YELLOW");
        yellow.setBackground(Color.yellow);
        yellow.addActionListener(e -> {
            if (pp.mouseH != null) {
                pp.mouseH.setColor(Color.YELLOW);
            }
        });

        JButton black = new JButton("BLACK");
        black.setBackground(Color.black);
        black.addActionListener(e -> {
            if (pp.mouseH != null) {
                pp.mouseH.setColor(Color.BLACK);
            }
        });

        JButton white = new JButton("WHITE");
        white.setBackground(Color.white);
        white.addActionListener(e -> {
            if (pp.mouseH != null) {
                pp.mouseH.setColor(Color.WHITE);
            }

        });

        colorWindow.add(red);
        colorWindow.add(green);
        colorWindow.add(blue);
        colorWindow.add(yellow);
        colorWindow.add(black);
        colorWindow.add(white);

        colorWindow.setVisible(false);

        bp.add(colorWindow);

    }


}
