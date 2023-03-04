package com.example.ThreeDementionalShapes;

import java.awt.geom.RectangularShape;

public class RectangularParallelepiped extends RectangularShapes {
    private double diagonalsLength;

    public RectangularParallelepiped() {
    }

    @Override
    public void countP(RectangularShapes parallelepiped) {
        double parallelepipedP = (parallelepiped.getEdge1Length()*4)+(parallelepiped.getEdge2Length()*8);
        System.out.println(parallelepipedP);
    }
    @Override
    public void countS(RectangularShapes parallelepiped) {
        double parallelepipedS = (parallelepiped.getEdge1Length()* parallelepiped.getEdge1Length()*2)+
                (parallelepiped.getEdge1Length()* parallelepiped.getEdge2Length()*4);
        System.out.println(parallelepipedS);
    }

    public RectangularParallelepiped(double diagonalsLength) {
        this.diagonalsLength = diagonalsLength;
    }

    public RectangularParallelepiped(double edge1Length, double edge2Length, double diagonalsLength) {
        super(edge1Length, edge2Length);
        this.diagonalsLength = diagonalsLength;
    }

    public double getDiagonalsLength() {
        return diagonalsLength;
    }

    public void setDiagonalsLength(double diagonalsLength) {
        this.diagonalsLength = diagonalsLength;
    }

    @Override
    public String toString() {
        return ""+ diagonalsLength;
    }
}
