package com.sparta.poly;

public abstract class Polygon implements Comparable {
    final double SQRT3 = 1.73;
    protected String description;
    protected int sideLength;
    protected int numSides;

    Polygon(String desc, int sides, int sideL) {
        this.description = desc;
        this.sideLength = sideL;
        this.numSides = sides;
    }

    public abstract int getArea();

    public int compareTo(Object x) {
        x=(Polygon) x;
        if (this.getArea() == x.getArea())
            return 0;
        if (this.getArea() > x.getArea())
            return 1;
        else
            return -1;
    }

}

