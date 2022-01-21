package com.loonydev.figures;

import com.loonydev.basefigure.Figure;

public class TriangleIsosceles extends Figure {

    private double mBase;
    private double mHeight;

    // -- Constructors
    public TriangleIsosceles() {
        this.mBase = 0;
        this.mHeight = 0;
    }

    public TriangleIsosceles(double mBase, double mHeight) {
        this.mBase = mBase;
        this.mHeight = mHeight;
    }

    // -- Override methods
    @Override
    public String toString() {
        return "{mArea=" + mArea + ", mPerimeter=" + mPerimeter + ", mBase=" + mBase + ", mHeight=" + mHeight + '}';
    }

    @Override
    public double areaCalculate() {
        return mArea = 0.5 * getBase() * getHeight();
    }

    @Override
    public double perimeterCalculate() {
        double a = Math.sqrt(Math.pow(getBase() / 2, 2) + Math.pow(getHeight(), 2));

        return mPerimeter = 2 * a + getBase();
    }

    // -- Getters
    public double getBase() {
        return mBase;
    }

    public double getHeight() {
        return mHeight;
    }

    // -- Setters
    public void setBase(double base) {
        this.mBase = base;
    }

    public void setHeight(double height) {
        this.mHeight = height;
    }
}
