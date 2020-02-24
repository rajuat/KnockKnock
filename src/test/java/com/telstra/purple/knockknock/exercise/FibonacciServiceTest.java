package com.telstra.purple.knockknock.exercise;

import com.telstra.purple.knockknock.exercise.services.FibonacciService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciServiceTest {
    @Test
    public void canGetNthFibonacciNumber() throws Exception{
        FibonacciService api = new FibonacciService();
        String ans = api.fibonacci(20);
        Assertions.assertEquals("6765", ans);
    }
}
