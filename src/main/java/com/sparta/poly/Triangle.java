package com.sparta.poly;

public class Triangle extends Polygon{
    Triangle(int sideL) {
        super("Triangle", 3, sideL);
    }

    @Override
    public double getArea() {
        return (this.sideLength*this.sideLength*1.732)/4;
    }

}
