package com.telstra.purple.knockknock.exercise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciAPITest {
    @Test
    public void canGetNthFibonacciNumber() {
        FibonacciAPI api = new FibonacciAPI();
        long ans = api.fibonacci(4444444);
        Assertions.assertEquals(7642726929121149811L, ans);
    }
}
