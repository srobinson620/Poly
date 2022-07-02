package com.sparta.poly;

public class Square extends Polygon{

    Square(int sideL) {
        super("Square", 4, sideL);
    }
    @Override
    public int getArea() {
        return sideLength*sideLength ;
    }

}