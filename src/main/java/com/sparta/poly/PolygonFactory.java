package com.sparta.poly;

import java.util.Random;

class PolygonFactory {
    static Random rand= new Random();
    static int polychoice;
    public static Polygon getPolygon(){
        Polygon p;
        polychoice = rand.nextInt(1,4);
        return p= switch (polychoice){
            case 1 -> new Triangle(rand.nextInt(15));
            case 2 -> new Square(rand.nextInt(15));
            default -> new Hexagon(rand.nextInt(15));
        };
    }
}
