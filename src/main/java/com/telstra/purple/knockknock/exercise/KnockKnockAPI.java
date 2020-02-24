package com.telstra.purple.knockknock.exercise;

import com.telstra.purple.knockknock.exercise.services.FibonacciService;
import com.telstra.purple.knockknock.exercise.services.ReverseWordsService;
import com.telstra.purple.knockknock.exercise.services.TokenService;
import com.telstra.purple.knockknock.exercise.services.TriangleTypeService;
import com.telstra.purple.knockknock.exercise.utils.StringPostProcessor;
import com.telstra.purple.knockknock.exercise.utils.TriangleType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/api")
public class KnockKnockAPI extends KnockKnockApplication {
    @Autowired
    private FibonacciService fibonacciService;

    @Autowired
    private ReverseWordsService reverseWordsService;

    @Autowired
    private TokenService tokenService;

    @Autowired
    private TriangleTypeService triangleTypeService;

    /**
     * Returns the nth number in the fibonacci sequence.
     *
     * @param index is the index of the fibonacci sequence
     * @return nth number of the fibonacci sequence
     */
    @GetMapping(value = "/Fibonacci", produces = MediaType.APPLICATION_JSON_VALUE)
    public String fibonacci(@RequestParam(value = "n") long index) throws Exception {
        return fibonacciService.fibonacci(index);
    }

    /**
     * Reverses the letters of each word in a sentence.
     *
     * @param sentence A sentence
     * @return A sentence with each words reversed.
     */
    @GetMapping(value = "/ReverseWords", produces = MediaType.APPLICATION_JSON_VALUE)
    public String reverseWords(@RequestParam("sentence") String sentence) {
        return reverseWordsService.reverseWords(sentence);
    }

    /**
     * Return my application job application specific token.
     */
    @GetMapping(value = "/Token", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getToken() {
        return tokenService.getToken();
    }

    /**
     * Returns the type of triangle given the lengths of its sides
     *
     * @param lengthA length of side
     * @param lengthB length of side
     * @param lengthC length of side
     * @return "Equilateral", "Isosceles", "Scalene" or "Error"
     */
    @GetMapping(value = "/TriangleType", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getTriangleType(@RequestParam("a") int lengthA, @RequestParam("b") int lengthB, @RequestParam("c") int lengthC) {
        return triangleTypeService.getTriangleType(lengthA, lengthB, lengthC);
    }

}
