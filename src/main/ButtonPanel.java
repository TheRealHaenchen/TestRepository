package main;

import javax.swing.*;
import java.awt.*;

public class ButtonPanel extends JPanel {

    // SCREEN SETTINGS
    public final int screenWidth = 250;
    public final int screenHeight = 700;

    public UI ui; // UI speichern
    public PaintPanel pp; //PaintPanel als Referenz speichern

    // CONSTRUCTOR OF BUTTONPANEL
    public ButtonPanel (PaintPanel pp){ //PaintPanel als Parameter hinzufügen

        this.pp = pp; // speichern von Paintpanel in instanzvariable
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.lightGray);
        this.setDoubleBuffered(true); // all drawing from this component will be done in offscreen painting buffer (=improve rendering)
        this.setFocusable(true);

        // UI korrekt mit paintpanel initialisiern
        this.ui = new UI(this, pp);
    }

    //method
    public void paintComponent(Graphics g) { // build in method in java to draw on JPanel Graphics=class with many functions to draw on screen

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D)g; //class extends Graphic-class = more functions

        // call UI
        ui.draw(g2);
    }
}
