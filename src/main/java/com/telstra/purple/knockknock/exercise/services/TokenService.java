package com.telstra.purple.knockknock.exercise.services;

import com.telstra.purple.knockknock.exercise.utils.StringPostProcessor;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
public class TokenService {
    private final String TOKEN = "6ae51a89-e435-458a-b479-288397f92e46";
    /**
     * Return my application job application specific token.
     */
    public String getToken() {
        return StringPostProcessor.process(TOKEN);
    }
}
