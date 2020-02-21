package com.telstra.purple.knockknock.exercise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseWordsAPITest {

    @Test
    public void canReverseEachWordInASentence(){
        ReverseWordsAPI api = new ReverseWordsAPI();
        String reversed = api.reverseWords("Hello World");
        Assertions.assertEquals("dlroW olleH", reversed);
    }
}
