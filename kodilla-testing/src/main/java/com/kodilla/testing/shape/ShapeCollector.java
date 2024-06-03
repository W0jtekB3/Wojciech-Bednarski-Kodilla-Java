package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        return shapes.remove(shape);
    }

    public Shape getFigure(int n) {
        if (n >= 0 && n < shapes.size()) {
            return shapes.get(n);
        }
        return null;
    }

    public String showFigures() {
        StringBuilder result = new StringBuilder();
        for (Shape shape : shapes) {
            result.append(shape.getShapeName()).append(", ");
        }
        if (result.length() > 0) {
            result.setLength(result.length() - 2); // Remove trailing comma and space
        }
        return result.toString();
    }
}
