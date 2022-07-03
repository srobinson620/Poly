package com.sparta.poly;

public class Hexagon extends Polygon{

    Hexagon(int sideL) {
        super("Hexagon", 6, sideL);
    }

    @Override
    public double getArea() {
        return (3 * sideLength * sideLength * SQRT3 / 2) ;
    }

}
