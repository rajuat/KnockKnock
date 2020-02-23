package com.telstra.purple.knockknock.exercise;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class FibonacciAPI extends ExerciseApplication {
    private final int START_OVERFLOW_INDEX = 93;
    /**
     * Returns the nth number in the fibonacci sequence.
     * @param index is the index of the fibonacci sequence
     * @return nth number of the fibonacci sequence
     */
    @GetMapping("Fibonacci")
    public long fibonacci(@RequestParam(value = "n") long index) throws Exception {
        if(index < 1) throw new IllegalArgumentException("Please provide a natural number.");
        if(index >= START_OVERFLOW_INDEX) throw new Exception("The fibonacci number with the given input is too large");

        long first = 0;
        long second = 1;
        if (index == 0) return 0;
        if (index == 1) return second;
        for (long i = 2; i <= index; i++) {
            long temp = first + second;
            first = second;
            second = temp;
        }
        return second;
    }
}
