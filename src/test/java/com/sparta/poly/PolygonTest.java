package com.sparta.poly;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class PolygonTest {
Polygon square;
Polygon triangle;
Polygon hexagon;
    @BeforeEach
    void setUp() {
        square = new Square(10);
        triangle = new Triangle(3);
        hexagon=new Hexagon(6);
    }

    @AfterEach
    void tearDown() {
        square = null;
        triangle = null;
        hexagon= null;
    }

    @Test
    @DisplayName("Get area of square 10x10=100")
    void getAreasSquare() {
        Assertions.assertEquals(100.00,square.getArea());
    }
    @Test
    @DisplayName("Get area of Triangle 3*3*1.732/4=3.897")
    void getAreasTriangle() {
        Assertions.assertEquals(3.897,triangle.getArea());
    }
    @Test
    @DisplayName("3x6x6x1.73/2=93.528")
    void getAreasHexagon() {
        Assertions.assertEquals(93.42,hexagon.getArea());
    }

    @Test
    @DisplayName("a.compareTo(b) a has bigger area than b returns 1")
    void biggerCompareToSmaller() {
        Assertions.assertEquals(square.compareTo(triangle),1);
    }

    @Test
    @DisplayName("a.compareTo(b) a has smaller area than b returns -1")
    void smallerCompareToBigger() {
        Assertions.assertEquals(hexagon.compareTo(square),-1);
    }

    @Test
    @DisplayName("a has equal area to b returns 0")
    void equalCompareToEqual() {
        Assertions.assertEquals(square.compareTo(square),0);
    }

    @Test
    void displayPolyformat() {

    }
}