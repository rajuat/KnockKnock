package com.telstra.purple.knockknock.exercise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciAPITest {
    @Test
    public void canGetNthFibonacciNumber() throws Exception{
        FibonacciAPI api = new FibonacciAPI();
        long ans = api.fibonacci(90);
        Assertions.assertEquals(2880067194370816120L, ans);
    }
}
