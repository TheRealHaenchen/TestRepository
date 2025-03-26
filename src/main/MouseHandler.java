package main;


import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;

public class MouseHandler implements MouseListener, MouseMotionListener {

    PaintPanel pp;
    public int x, y;
    public Color color;
    public int STROKE_SIZE;

    public ArrayList<ColorPoint> currentPath;

    public void setColor(Color c) {
        this.color = c;
    }

    public void setSTROKE_SIZE(int size) {
        this.STROKE_SIZE = size;
    }



    // create constructor and receive PaintPanel
    public MouseHandler(PaintPanel pp) {
        this.pp = pp;
    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

        System.out.println("MousePressed");
        //get current mouse location
        x = e.getX();
        y = e.getY();

        Ellipse2D.Double ellipse = new Ellipse2D.Double(x, y, STROKE_SIZE, STROKE_SIZE);

        Graphics g = pp.getGraphics();
        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(color);
        g2.fill(ellipse);

        //start currentPath
        currentPath = new ArrayList<>(25);
        currentPath.add(new ColorPoint(color, x, y));


    }

    public void drawCurrentPath(MouseEvent e) {

        //get current location
        x = e.getX();
        y = e.getY();

        //used to be able to draw a line
        Graphics2D g2 = (Graphics2D) pp.getGraphics();
        if (!currentPath.isEmpty()) {
            ColorPoint prevPoint = currentPath.get(currentPath.size() - 1);
            g2.setStroke(new BasicStroke(STROKE_SIZE));

            //connect the current point to previous
            g2.setColor(color);
            g2.drawLine(prevPoint.getX(), prevPoint.getY(), x, y);

        }
        g2.dispose();

        // add new point to path
        ColorPoint nextPoint = new ColorPoint(color, e.getX(), e.getY());
        currentPath.add(nextPoint);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        drawCurrentPath(e); // Zeichne current Path

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //reset current Path
        currentPath = null;

    }

    @Override
    public void mouseEntered(MouseEvent e) {


    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}

