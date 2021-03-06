package com.telstra.purple.knockknock.exercise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;

@SpringBootApplication
@RequestMapping(value = "/api/")
public class KnockKnockApplication {
	public static void main(String[] args) {
		SpringApplication.run(KnockKnockApplication.class, args);
	}



	@ModelAttribute
	public void setResponseHeder(HttpServletResponse response){
		response.setHeader("cache-control", "no-cache");
		response.setHeader("cf-cache-status", "DYNAMIC");
		response.setHeader("x-content-type-options", "nosniff");
	}


}
