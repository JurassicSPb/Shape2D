package Shapes;

public class Rectangle extends MultiAngle {
    private double width;
    private double height;

    public Rectangle() {
        super(4);
//        init();
    }

    public Rectangle(double width, double height) {
        super(4);
//        init();
        this.width = width;
        this.height = height;
        calcP();
        calcS();
    }

//    private void init() {
//        //...
//    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
        calcS();
        calcP();
    }

    public void setHeight(double height) {
        this.height = height;
        calcS();
        calcP();
    }

    private void calcS() {
        s = width * height;
    }

    private void calcP() {
        p = 2 * (width + height);
    }

    @Override
    public void draw() {
        System.out.println("Draw rectangle " + width + " x " + height);
    }

    @Override
    public String toString() {
        return "This is rectangle with: width = " + width + ", height = " + height;
    }
     @Override
    public boolean equals (Object r2){
        Rectangle rect = (Rectangle) r2;
        return this.width == rect.width && this.height == rect.height;
    }
}