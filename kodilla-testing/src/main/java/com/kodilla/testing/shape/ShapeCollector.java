package com.kodilla.testing.shape;

import java.util.*;

public class ShapeCollector {

    private List<Shape> shapes = new ArrayList<Shape>();

    public List<Shape> addFigure(Shape shape) {
        shapes.add(shape);
        return shapes;
    }

    public List<Shape> removeFigure(Shape shape) {
        shapes.remove(shape);
        return shapes;
    }

    public Shape getFigure(int n){
        return shapes.get(n);
    }

    public List<Shape> showFigures() {
        System.out.println(shapes);
       return shapes;
    }
}
