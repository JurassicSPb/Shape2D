package Shapes;

public abstract class Shape2D {
    protected double s;
    protected double p;
    protected int color;

    public double getS() {
        return s;
    }

    public double getP() {
        return p;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public abstract void draw();
}