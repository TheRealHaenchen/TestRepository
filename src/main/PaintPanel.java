package main;

import javax.swing.*;
import java.awt.*;


public class PaintPanel extends JPanel {

    // SCREEN SETTINGS
    public final int screenWidth = 750;
    public final int screenHeight = 700;

    public MouseHandler mouseH;


    // CONSTRUCTOR OF PAINTPANEL
    public PaintPanel (){

        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.white);
        this.setDoubleBuffered(true); // all drawing from this component will be done in offscreen painting buffer (=improve rendering)
        mouseH = new MouseHandler(this);
        this.addMouseListener(mouseH);
        this.addMouseMotionListener(mouseH);
        this.setFocusable(true);
    }

    //method
    public void paintComponent(Graphics g) { // build in method in java to draw on JPanel Graphics=class with many functions to draw on screen

        super.paintComponent(g);

        //Graphics2D g2 = (Graphics2D)g; //class extends Graphic-class = more functions

    }
}
