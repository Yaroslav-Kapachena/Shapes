package com.example.ThreeDementionalShapes;

public class Ball extends UnRectanngularShapes{
    private  String colour;
    private static final double PI = 3.14;
    public  Ball(){
    }

    public Ball(String colour) {
        this.colour = colour;
    }

    public Ball(double radius, String colour) {
        super(radius);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void countBallV(Ball ball){
        double PIr3 = PI* ball.getRadius()* ball.getRadius()* ball.getRadius();
        double ballV = (4*PIr3)/4;
        System.out.println(ballV);
    }

    @Override
    public String toString() {
        return "" + colour;
    }
}
