package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapes;

    public ShapeCollector() {
        shapes = new ArrayList<>();
    }

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        return shapes.remove(shape);
    }

    public Shape getFigure() {
        return getFigure(0);
    }

    public Shape getFigure(int n) {
        Shape result;
        if (n >= 0 && n < shapes.size()) {
            result = shapes.get(n);
        } else {
            result = null;
        }
        return result;
    }

    public String showFigures() {
        StringBuilder result = new StringBuilder("Shapes in collection:\n");
        for (Shape shape : shapes) {
            result.append(shape.getShapeName()).append("\n");
        }
        return result.toString();
    }

    public List<Shape> getShapes() {
        return shapes;
    }

    public int getFigureCount() {
        return 0;
    }
}

