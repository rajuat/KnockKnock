package com.telstra.purple.knockknock.exercise;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class TokenAPI extends ExerciseApplication {

    /**
     * Return my application job application specific token.
     */
    @GetMapping("Token")
    public String getToken() {
        return "6ae51a89-e435-458a-b479-288397f92e46";
    }

}
