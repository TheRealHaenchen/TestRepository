package main;

import javax.swing.*;
import java.awt.*;

public class UI {

    PaintPanel pp;
    Graphics2D g2;

    JButton button = new JButton();

    //constructor
    public UI(PaintPanel pp) {
        this.pp = pp;

    }

    //create method
    public void draw(Graphics2D g2) {
        this.g2 = g2; //to use g2 in other methods in this class

        drawSubScreen();

        pp.add(button);

        drawButton();

    }

    //method
    public void drawSubScreen() {

        Color c = new Color(0xD5D5D5);
        g2.setColor(c);
        g2.fillRect(1, 1, 250, 700);
    }

    public void drawButton() {

        button.setBounds(25, 50, 200, 40);
        button.addActionListener(e ->System.out.println("COLOR")); // lambda expression
        button.setText("COLOR >");
        button.setFocusable(false);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setBackground(Color.gray);
        button.setFont(new Font("Arial",Font.BOLD,25));

    }


}
