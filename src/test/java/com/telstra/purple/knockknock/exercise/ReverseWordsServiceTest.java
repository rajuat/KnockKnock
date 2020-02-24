package com.telstra.purple.knockknock.exercise;

import com.telstra.purple.knockknock.exercise.services.ReverseWordsService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseWordsServiceTest {

    @Test
    public void canReverseEachWordInASentence(){
        ReverseWordsService api = new ReverseWordsService();
        String reversed = api.reverseWords("Hello World");
        Assertions.assertEquals("\"" + "olleH dlroW" + "\"", reversed);
    }
}
