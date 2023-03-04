package com.example.ThreeDementionalShapes;

public class RectangularParallelepiped extends RectangularShapes {
    private double diagonalsLength;

    public RectangularParallelepiped() {
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

    public void countParallelepipedP(RectangularParallelepiped parallelepiped){
        //parallelepipedP-периметр параллелепипеда
        double parallelepipedP = (parallelepiped.getEdge1Length()*4)+(parallelepiped.getEdge2Length()*8);
        System.out.println(parallelepipedP);
    }
    public  void countParallelepipedS(RectangularParallelepiped parallelepiped){
        //parallelepipedS-площадь параллелепипеда
        double parallelepipedS = (parallelepiped.getEdge1Length()* parallelepiped.getEdge1Length()*2)+
                (parallelepiped.getEdge1Length()* parallelepiped.getEdge2Length()*4);
        System.out.println(parallelepipedS);
    }

    @Override
    public String toString() {
        return ""+ diagonalsLength;
    }
}
