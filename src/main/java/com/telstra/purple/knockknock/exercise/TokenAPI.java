package com.telstra.purple.knockknock.exercise;

import com.telstra.purple.knockknock.exercise.utils.StringPostProcessor;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class TokenAPI extends ExerciseApplication {
    private final String TOKEN = "6ae51a89-e435-458a-b479-288397f92e46";
    /**
     * Return my application job application specific token.
     */
    @GetMapping(value = "Token", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getToken() {
        return StringPostProcessor.process(TOKEN);
    }

    @GetMapping("/helloworld")
    public String hello() {
        return "\"" + "Hello World" + "\"";
    }

}
