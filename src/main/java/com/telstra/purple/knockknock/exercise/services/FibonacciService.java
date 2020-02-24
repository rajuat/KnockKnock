package com.telstra.purple.knockknock.exercise.services;

import com.telstra.purple.knockknock.exercise.KnockKnockApplication;
import org.springframework.stereotype.Service;

@Service
public class FibonacciService {
    private final int START_OVERFLOW_INDEX = 93;
    /**
     * Returns the nth number in the fibonacci sequence.
     * @param index is the index of the fibonacci sequence
     * @return nth number of the fibonacci sequence
     */
    public String fibonacci(long index) throws Exception {
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
