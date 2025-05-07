package org.yourcompany.finalayd2.geometry;

public class RectangleArea implements ShapeStrategy {

    public double calculate(double... d) {
        return d[0] * d[1];
    }
}
