package com.kodilla.testing.shape;

import java.util.ArrayList;
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

    public Shape getFigure(int n) {
        if (n >= 0 && n < shapes.size()) {
            return shapes.get(n);
        } else {
            return null;
        }
    }

    public String showFigures() {
        StringBuilder result = new StringBuilder("Shapes in collection:\n");
        for (Shape shape : shapes) {
            result.append(shape.getShapeName()).append("\n");
        }
        return result.toString();
    }
}
