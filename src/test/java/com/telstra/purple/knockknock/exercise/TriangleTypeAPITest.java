package com.telstra.purple.knockknock.exercise;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TriangleTypeAPITest {

    private TriangleTypeAPI api;

    @BeforeEach
    public void setUp(){
        api = new TriangleTypeAPI();
    }

    @Test
    public void canCheckForInvalidTriangle(){
        assertEquals("Error", api.getTriangleType(1,1,3));
    }

    @Test
    public void canCheckForEquilateralTriangle(){
        assertEquals("Equilateral", api.getTriangleType(1,1,1));
    }

    @Test
    public void canCheckForIsoscelesTriangle(){
        assertEquals("Isosceles", api.getTriangleType(1,3,3));
    }

    @Test
    public void canCheckForScaleneTriangle(){
        assertEquals("Scalene", api.getTriangleType(2,4,5));
    }
}
