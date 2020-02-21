package com.telstra.purple.knockknock.exercise;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;

@RestController
public class TriangleTypeAPI extends ExerciseApplication {
    /**
     * Returns the type of triangle given the lengths of its sides
     * @param a length of side
     * @param b length of side
     * @param c length of side
     * @return "Equilateral", "Isosceles", "Scalene" or "Error"
     */
    @GetMapping("TriangleType")
    public String getTriangleType(@RequestParam("a") int a, @RequestParam("b") int b, @RequestParam("c") int c) {
        if (isValidTriangle(a, b, c)) {
            Set<Integer> uniqueNoOfSides = new HashSet();
            uniqueNoOfSides.add(a);
            uniqueNoOfSides.add(b);
            uniqueNoOfSides.add(c);
            int sides = uniqueNoOfSides.size();
            if(sides == 1) return "Equilateral";
            if(sides == 2) return "Isosceles";
            return "Scalene";
        } else {
            return "Error";
        }
    }

    /*
     * The sum of the length of any two sides should be greater than that of the third side
     */
    private boolean isValidTriangle(int a, int b, int c) {
        return (a + b > c && b + c > a && c + a > b);
    }
}
