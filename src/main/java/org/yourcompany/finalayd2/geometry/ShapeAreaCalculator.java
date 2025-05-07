package org.yourcompany.finalayd2.geometry;

import java.util.HashMap;
import java.util.Map;

public class ShapeAreaCalculator {

    private final Map<String, ShapeStrategy> strategies = new HashMap<>();

    public ShapeAreaCalculator() {
        strategies.put("circle", new CircleArea());
        strategies.put("rectangle", new RectangleArea());
        strategies.put("triangle", new TriangleArea());
    }

    public double calculate(String shape, double... dims) {
        ShapeStrategy strategy = strategies.get(shape.toLowerCase());
        if (strategy == null) {
            throw new IllegalArgumentException("Unknown shape");
        }
        return strategy.calculate(dims);
    }
}
