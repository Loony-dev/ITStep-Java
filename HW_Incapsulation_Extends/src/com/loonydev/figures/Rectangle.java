package com.loonydev.figures;

import com.loonydev.basefigure.Figure;

public class Rectangle extends Figure {

    private double mWidth;
    private double mHeight;

    // -- Constructors
    public Rectangle() {
        this.mWidth = 0;
        this.mHeight = 0;
    }

    public Rectangle(double width, double height) {
        this.mWidth = width;
        this.mHeight = height;
    }

    // -- Override methods
    @Override
    public String toString() {
        return "{mArea=" + mArea + ", mPerimeter=" + mPerimeter + ", mWidth=" + mWidth + ", mHeight=" + mHeight + '}';
    }

    @Override
    public double areaCalculate() {
        return mArea = this.mWidth * this.mHeight;
    }

    @Override
    public double perimeterCalculate() {
        return mPerimeter = this.mWidth * 2 + this.mHeight * 2;
    }

    // -- Getters
    public double getWidth() {
        return mWidth;
    }

    public double getHeight() {
        return mHeight;
    }

    // -- Setters
    public void setWidth(double width) {
        this.mWidth = width;
    }

    public void setHeight(double height) {
        this.mHeight = height;
    }
}
