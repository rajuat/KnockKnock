package com.telstra.purple.knockknock.exercise;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class ReverseWordsAPI extends ExerciseApplication {
    /**
     * Reverses the letters of each word in a sentence.
     * @param sentence A sentence
     * @return A sentence with each words reversed.
     */
    @GetMapping(value = "ReverseWords", produces = MediaType.APPLICATION_JSON_VALUE)
    public String reverseWords(@RequestParam("sentence") String sentence){
        if(sentence == null) throw new IllegalArgumentException("Please provide a sentence in order to reverse it.");

        StringBuilder reversedSentence = new StringBuilder();
        StringBuilder word = new StringBuilder();
        for(char ch : sentence.toCharArray()){
            // until a blank character comes, keep in a word builder
            if(ch != ' '){
                word.append(ch);
            } else {
                // reverse the word builder and keep in a sentence builder
                reversedSentence.append(word.reverse());
                // put a blank character in the sentence builder
                reversedSentence.append(ch);
                // clear the word builder for later use
                word.setLength(0);
            }
        }
        // if the last character is not blank, reverse the last word builder and keep in the sentence builder
        if(sentence.charAt(sentence.length()-1) != ' '){
            reversedSentence.append(word.reverse());
        }
        return reversedSentence.toString();
    }
}
