package com.loonydev.basefigure;

public class Figure {

    protected double mArea;
    protected double mPerimeter;

    public void calculate() {
        areaCalculate();
        perimeterCalculate();
    }

    public double areaCalculate() {
        return 0;
    }

    public double perimeterCalculate() {
        return 0;
    }

    public double getArea() {
        return mArea;
    }

    public double getPerimeter() {
        return mPerimeter;
    }
}
