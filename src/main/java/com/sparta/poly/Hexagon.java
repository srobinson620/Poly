package com.sparta.poly;

public class Hexagon extends Polygon{

    Hexagon(int sideL) {
        super("Hexagon", 6, sideL);
    }

    @Override
    public int getArea() {
        return (int) (3 * sideLength * sideLength * SQRT3 / 2) ;
    }

}
