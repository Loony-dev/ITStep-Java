package com.loonydev;

import com.loonydev.figures.Circle;
import com.loonydev.figures.Rectangle;
import com.loonydev.figures.TriangleIsosceles;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(10);
        circle.calculate();

        System.out.println("circle = " + circle);

        // --
        Rectangle rectangle = new Rectangle(10, 20);
        rectangle.calculate();

        System.out.println("rectangle = " + rectangle);

        // --
        TriangleIsosceles triangleIsosceles = new TriangleIsosceles(10, 10);
        triangleIsosceles.calculate();

        System.out.println("triangleIsosceles = " + triangleIsosceles);
    }
}
