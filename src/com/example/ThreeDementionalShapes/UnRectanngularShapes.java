package com.example.ThreeDementionalShapes;

public abstract class UnRectanngularShapes {
    private double radius;
    public UnRectanngularShapes(){

    }

    public UnRectanngularShapes(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
