package shapes;

import java.awt.Graphics;

public class Circle extends Shape{
    
    protected int diameter = 10;

    public Circle(int x, int y, int diameter, String color) {
        super(x, y, diameter, color);
        this.diameter = diameter;
    }

    @Override
    public void draw(Graphics g) {
        if (g == null) {
            System.out.println("drawing a" + diameter + " diameter " + color + " circle");
        } else {
            g.setColor(color);
            g.drawOval(x, y, diameter, diameter);
        }
    }
}