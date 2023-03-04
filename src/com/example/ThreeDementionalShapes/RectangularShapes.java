package com.example.ThreeDementionalShapes;

import java.awt.geom.RectangularShape;

public abstract class RectangularShapes {
    private double edge1Length;
    private double edge2Length;

    public RectangularShapes() {
    }

    public RectangularShapes(double edge1Length, double edge2Length) {
        this.edge1Length = edge1Length;
        this.edge2Length = edge2Length;
    }

    public double getEdge1Length() {
        return edge1Length;
    }

    public void setEdge1Length(double edge1Length) {
        this.edge1Length = edge1Length;
    }

    public double getEdge2Length() {
        return edge2Length;
    }

    public void setEdge2Length(double edge2Length) {
        this.edge2Length = edge2Length;
    }

    public abstract void countP(RectangularShapes parallelepiped);
    public abstract void countS(RectangularShapes parallelepiped);
}
