package com.example.ThreeDementionalShapes;

public class TestLogic {
    public static void main(String[] args) {
        Cube cube1  = new Cube(5,5);
        cube1.countP(cube1);
        cube1.countS(cube1);
        RectangularParallelepiped parallelepiped1 = new RectangularParallelepiped(
                5,
                7,
                9);
        parallelepiped1.countParallelepipedP(parallelepiped1);
        parallelepiped1.countParallelepipedS(parallelepiped1);
        Ball ball1  = new Ball(5,"Blue");
        ball1.countBallV(ball1);
        Cylinder cylinder1 = new Cylinder(6,8);
        cylinder1.countCylinderV(cylinder1);
    }
}
