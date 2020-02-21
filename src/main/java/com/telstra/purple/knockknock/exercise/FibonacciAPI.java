package com.telstra.purple.knockknock.exercise;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class FibonacciAPI extends ExerciseApplication {
    /**
     * Returns the nth number in the fibonacci sequence.
     * @param n is the index of the fibonacci sequence
     * @return nth number of the fibonacci sequence
     */
    @GetMapping("Fibonacci")
    public long fibonacci(@RequestParam(value = "n") long n) {
        long first = 0;
        long second = 1;
        if (n == 0) return 0;
        if (n == 1) return second;
        for (long i = 2; i <= n; i++) {
            long temp = first + second;
            first = second;
            second = temp;
        }
        return second;
    }
}
