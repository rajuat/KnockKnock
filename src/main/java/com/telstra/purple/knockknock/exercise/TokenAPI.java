package com.telstra.purple.knockknock.exercise;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TokenAPI extends ExerciseApplication {

    /**
     * Return my application job application specific token.
     */
    @GetMapping("Token")
    public String getToken() {
        return "6ae51a89-e435-458a-b479-288397f92e46";
    }
}
