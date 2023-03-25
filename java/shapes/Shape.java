package shapes;

import java.awt.Graphics;
import java.awt.Color;

public abstract class Shape {

    public static final Color DEFAULTCOLOR = Color.RED;
    protected Color color; // the data that is common to ALL shapes
    protected int x;        // x,y is the top left corner of all the shapes (except triangle)
    protected int y;
    protected int width;
    protected int height;

    // default constructor
    public Shape() {
        this.color = DEFAULTCOLOR;
    }

    public Shape(int x, int y, int width, int height, String color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = Color.decode(color);
    }

    abstract public void draw(Graphics g);
}