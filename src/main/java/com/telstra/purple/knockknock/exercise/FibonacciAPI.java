package com.telstra.purple.knockknock.exercise;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
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
    @GetMapping(value = "Fibonacci", produces = MediaType.APPLICATION_JSON_VALUE)
    public String fibonacci(@RequestParam(value = "n") long index) throws Exception {
        if(Math.abs(index) >= START_OVERFLOW_INDEX) throw new Exception("The fibonacci number with the given input is too large");
        int sign = index >= 0 ? 1 : -1;
        long fibonacciNumber = getNthFibonacciNumber(Math.abs(index));
        long answer = sign * fibonacciNumber;
        return String.valueOf(answer);
    }

    private long getNthFibonacciNumber(long index){
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
