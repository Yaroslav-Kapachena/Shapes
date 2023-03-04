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
    public void countP(Cube cube){
        //P-перимутр
        double P = (cube.getEdge1Length()*12);
        System.out.println(P);
    }
    public void countS(Cube cube){
        //S-площадь
        double S = cube.getEdge1Length()*cube.getEdge1Length()*6;
        System.out.println(S);
    }

    @Override
    public String toString() {
        return "Cube{}";
    }
}
