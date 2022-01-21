package com.loonydev.figures;

import com.loonydev.basefigure.Figure;

public class Circle extends Figure {

    private double mRadius;

    // -- Constructors
    public Circle() {
        this.mRadius = 0;
    }

    public Circle(double radius) {
        this.mRadius = radius;
    }

    // -- Override methods
    @Override
    public String toString() {
        return "{area=" + mArea + ", perimeter=" + mPerimeter + ", radius=" + mRadius + '}';
    }

    @Override
    public double areaCalculate() {
        return mArea = Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public double perimeterCalculate() {
        return mPerimeter = 2 * Math.PI * getRadius();
    }

    // -- Getters
    public double getRadius() {
        return mRadius;
    }

    // -- Setters
    public void setRadius(double radius) {
        this.mRadius = radius;
    }
}
