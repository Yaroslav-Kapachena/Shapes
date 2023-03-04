package com.example.ThreeDementionalShapes;

public class Cube extends RectangularShapes {

    public static final int cubeEdgesNumber = 12 ;
    public static final int cubeFacesNumber = 6;
    public static final int cubeVerticesNumber = 4;

    public Cube() {
    }

    public Cube(double edge1Length, double edge2Length) {
        super(edge1Length, edge2Length);
    }

    @Override
    public void countP(RectangularShapes parallelepiped) {
        double parallelepipedP = (parallelepiped.getEdge1Length()*4)+(parallelepiped.getEdge2Length()*8);
        System.out.println(parallelepipedP);
    }

    @Override
    public void countS(RectangularShapes parallelepiped) {
        //S-площадь
        double S = (parallelepiped.getEdge1Length()* parallelepiped.getEdge1Length()*2)+
                (parallelepiped.getEdge1Length()* parallelepiped.getEdge2Length()*4);
        System.out.println(S);
    }
    @Override
    public String toString() {
        return "Cube{}";
    }
}
