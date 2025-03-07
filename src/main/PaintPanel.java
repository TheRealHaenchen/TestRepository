package main;

import javax.swing.*;
import java.awt.*;

public class PaintPanel extends JPanel {

    // SCREEN SETTINGS
    public final int screenWidth = 1000;
    public final int screenHeight = 700;

    public MouseHandler mouseH = new MouseHandler(this);
    public UI ui = new UI(this);

    // CONSTRUCTOR OF PAINTPANEL
    public PaintPanel (){

        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.white);
        //this.setDoubleBuffered(true); // all drawing from this component will be done in offscreen painting buffer (=improve rendering)
        this.addMouseListener(mouseH);
        this.setFocusable(true);
    }

    public void paintComponent(Graphics g) { // build in method in java to draw on JPanel Graphics=class with many functions to draw on screen

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D)g; //class extends Graphic-class = more functions

        // call UI
        ui.draw(g2);
    }
}
