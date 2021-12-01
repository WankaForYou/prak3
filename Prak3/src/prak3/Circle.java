package prak3;

public class Circle {
    private Point point;
    private String color;
    private int rad;

    public Circle(int x, int y, String color, int rad)
    {
        this.point = new Point(x, y);
        this.color = color;
        this.rad = rad;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public void setPoint(int x, int y)
    {
        this.point.setX(x);
        this.point.setY(y);
    }

    public void setRad(int rad)
    {
        this.rad = rad;
    }

    public String getColor()
    {
        return color;
    }

    public Point getPoint()
    {
        return point;
    }

    public int getRad()
    {
        return rad;
    }

    public String toString()
    {
        return "Circle{Center of the circle is (" + this.point.getX() + ", " + this.point.getY() + "), radius of the circle is " + rad + ", color of the circle is " + color + "}.";
    }
}
