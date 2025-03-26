package main;

import java.awt.*;

public class ColorPoint {
    public Color color;
    public int x, y;

    //constructor
    public ColorPoint(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


}
