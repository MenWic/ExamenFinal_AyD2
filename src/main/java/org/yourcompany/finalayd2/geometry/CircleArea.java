package org.yourcompany.finalayd2.geometry;

public class CircleArea implements ShapeStrategy {

    public double calculate(double... d) {
        return Math.PI * d[0] * d[0];
    }
}
