package org.example;

public class ShapeFactory {
    public static Shape getShape(ShapeType shapeType) {

        if(shapeType == ShapeType.CIRCLE) {
            return new Circle();
        }
        else if(shapeType == ShapeType.RECTANGLE) {
            return new Rectangle();
        }
        else if(shapeType == ShapeType.SQUARE) {
            return new Square();
        }
        else if(shapeType == ShapeType.TRIANGLE) {
            return new Triangle();
        }
        return null;
    }
}
