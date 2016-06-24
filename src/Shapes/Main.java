package Shapes;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Rectangle rect = new Rectangle(10, 5);
//
//        System.out.println("S rect = " + rect.getS());
//
//        rect.setWidth(35);
//
//        System.out.println("S rect = " + rect.getS());
//
//        SquareAsRect squareAsRect = new SquareAsRect(10);
//        squareAsRect.setWidth(20);
//
//        System.out.println(squareAsRect.getS());
//
//        squareAsRect.setHeight(5);
//
//        System.out.println(squareAsRect.getS());
//
////        Shape2D shape2D = new Shape2D();
//
//        rect.draw();
//        squareAsRect.draw();

        ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
        ArrayList<SquareAsRect> squares = new ArrayList<SquareAsRect>();
        ArrayList<MultiAngle> multiAngles = new ArrayList<MultiAngle>();

        rectangles.add(new Rectangle(23, 545));
        multiAngles.add(new MultiAngle(8));
        squares.add(new SquareAsRect(20));

        ArrayList<Shape2D> shapes = new ArrayList<Shape2D>();
        Rectangle rect = new Rectangle(34, 65);
        shapes.add(rect);
        shapes.add(new SquareAsRect(45));
        shapes.add(new MultiAngle(7));

        for (int i = 0; i < shapes.size(); i++) {
            shapes.get(i).draw();
            System.out.println("S = " + shapes.get(i).getS());
        }

        rect.getWidth();
//        shapes.get(0).getWidth();

        Shape2D multiAngle = new MultiAngle(8);
//        multiAngle.getAngleCount()

        Object obj = new Rectangle(23, 54);
        System.out.println(obj); //System.out.println(obj.toString());
        System.out.println(rect);

        SquareAsRect square = new SquareAsRect(324);

        System.out.println(square);

    }
}