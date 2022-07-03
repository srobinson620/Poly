package com.sparta.poly;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Polygon> polyList = new ArrayList<Polygon>();
        System.out.println("-------------------------------RANDOM POLYGON ARRAY ---------------------------");
        for(int x=0;x<100 ;x++){
            polyList.add(PolygonFactory.getPolygon());
            Polygon.displayPoly(polyList.get(x));
        }
        System.out.println("-------------------------------SORTED POLYGON ARRAY ---------------------------");
        polyList.sort(null);
        for(int x=0;x<100 ;x++){
            Polygon.displayPoly(polyList.get(x));
        }
    }
}




























