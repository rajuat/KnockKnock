package com.telstra.purple.knockknock.exercise;

import com.telstra.purple.knockknock.exercise.utils.StringPostProcessor;
import com.telstra.purple.knockknock.exercise.utils.TriangleType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;

@RestController
@EnableAutoConfiguration
public class TriangleTypeAPI extends ExerciseApplication {
    /**
     * Returns the type of triangle given the lengths of its sides
     *
     * @param lengthA length of side
     * @param lengthB length of side
     * @param lengthC length of side
     * @return "Equilateral", "Isosceles", "Scalene" or "Error"
     */
    @GetMapping(value = "TriangleType", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getTriangleType(@RequestParam("a") int lengthA, @RequestParam("b") int lengthB, @RequestParam("c") int lengthC) {
        String answer = null;
        if (isValidTriangle(lengthA, lengthB, lengthC)) {
            Set<Integer> uniqueNoOfSides = new HashSet<>();
            uniqueNoOfSides.add(lengthA);
            uniqueNoOfSides.add(lengthB);
            uniqueNoOfSides.add(lengthC);
            int sides = uniqueNoOfSides.size();
            if (sides == 1) {
                answer = TriangleType.EQUILATERAL.toString();
            } else if (sides == 2) {
                answer = TriangleType.ISOSCELES.toString();
            } else {
                answer = TriangleType.SCALENE.toString();
            }
        } else {
            answer = TriangleType.ERROR.toString();
        }
        return StringPostProcessor.process(answer);
    }

    /*
     * All sides have a length.
     * The sum of the length of any two sides should be greater than that of the third side.
     */
    private boolean isValidTriangle(int lengthA, int lengthB, int lengthC) {
        boolean allPositive = lengthA > 0 && lengthB > 0 && lengthC > 0;
        boolean valid = lengthA + lengthB > lengthC && lengthB + lengthC > lengthA && lengthC + lengthA > lengthB;
        return allPositive && valid;
    }
}
