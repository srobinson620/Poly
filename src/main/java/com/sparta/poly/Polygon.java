package com.sparta.poly;

public abstract class Polygon implements PolyInterface, Comparable {
    final double SQRT3 = 1.73;
    protected String description;
    protected int sideLength;
    protected int numSides;

    Polygon(String desc, int sides, int sideL) {
        this.description = desc;
        this.sideLength = sideL;
        this.numSides = sides;
    }

    public abstract double getArea();

    public int compareTo(Object y) {
        Polygon x=(Polygon) y;
        if (this.getArea() == x.getArea())
            return 0;
        if (this.getArea() > x.getArea())
            return 1;
        else
            return -1;
    }
    public static void  displayPoly(Polygon p){
        System.out.printf("%-10s has %d. Side length:%d Area:%.2f%n", p.description, p.numSides, p.sideLength, p.getArea());
    }
}

