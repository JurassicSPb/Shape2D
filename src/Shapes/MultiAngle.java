package Shapes;

public class MultiAngle extends Shape2D {
    protected int angleCount;

    public MultiAngle(int angleCount) {
        this.angleCount = angleCount;
    }

    public int getAngleCount() {
        return angleCount;
    }

    @Override
    public void draw() {
        System.out.println("Draw " + angleCount + "-angle");
    }

}