package org.example;

public class TestFactoryCode {
    public static void main(String[] args) {
        Shape shape = ShapeFactory.getShape(ShapeType.CIRCLE);
        shape.draw();
        Shape shape2 = ShapeFactory.getShape(ShapeType.RECTANGLE);
        shape2.draw();
        Shape shape3 = ShapeFactory.getShape(ShapeType.SQUARE);
        shape3.draw();
        Shape shape4 = ShapeFactory.getShape(ShapeType.TRIANGLE);
        shape4.draw();

    }
}
