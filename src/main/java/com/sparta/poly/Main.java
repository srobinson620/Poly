package com.sparta.poly;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
/*        Polygon testPoly;
        for(int x=0;x<10 ;x++){
            testPoly=PolygonFactory.getPolygon();
            System.out.println(testPoly);
        }
*/        Polygon tri = new Triangle(10);
        Square sq = new Square(5);
        Hexagon hex = new Hexagon(9);
        ArrayList<Polygon> polyList = new ArrayList<Polygon>();
        polyList.add(tri);
        polyList.add(sq);
        polyList.add(hex);
        System.out.println(hex.getArea());
        System.out.println(tri.getArea());
        System.out.println(sq.getArea());
        Random rand = new Random();
        int[] myList = new int[100];
        for (int i = 0;i<100;i++){
            myList[i] = rand.nextInt(100);
            System.out.println(myList[i]);
        }
        for(int x:myList){
            System.out.println(x);

        }
        // convert array to ArrayList
        ArrayList newList = new ArrayList(Arrays.asList(myList));
        polyList.sort(null);
        System.out.println(polyList);

    }

}




























