package com.example.ThreeDementionalShapes;

public class Cylinder extends UnRectanngularShapes{
    private double high;
    private static final double PI = 3.14;
    public Cylinder(){
    }

    public Cylinder(double high) {
        this.high = high;
    }

    public Cylinder(double radius, double high) {
        super(radius);
        this.high = high;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public void countCylinderV(Cylinder cylinder){
        double cylinderS = PI*cylinder.getRadius()* cylinder.getRadius();
        double cylinderV = cylinder.getHigh()*cylinderS;
        System.out.println(cylinderV);
    }

    @Override
    public String toString() {
        return "" + high;
    }
}
