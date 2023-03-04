package com.example.ThreeDementionalShapes;

public class TestLogic {
    public static void main(String[] args) {
        RectangularShapes parallelepiped1 = new Cube(5,5);
        parallelepiped1.countP(parallelepiped1);
        parallelepiped1.countS(parallelepiped1);
        RectangularShapes parallelepiped2 = new RectangularParallelepiped(6,8,10);
        parallelepiped2.countP(parallelepiped2);
        parallelepiped2.countS(parallelepiped2);
    }
}
