package com.telstra.purple.knockknock.exercise.services;

import com.telstra.purple.knockknock.exercise.KnockKnockApplication;
import com.telstra.purple.knockknock.exercise.utils.StringPostProcessor;
import org.springframework.stereotype.Service;

@Service
public class ReverseWordsService {
    /**
     * Reverses the letters of each word in a sentence.
     * @param sentence A sentence
     * @return A sentence with each words reversed.
     */
    public String reverseWords(String sentence){
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
        String answer = StringPostProcessor.process(reversedSentence.toString());
        return answer;
    }
}
