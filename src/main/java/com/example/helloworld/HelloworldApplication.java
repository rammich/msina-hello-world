package com.example.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping(value="hello")
public class HelloworldApplication{

	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
		System.out.println("Hello world...");
	}
	
    @RequestMapping(value="/",method=RequestMethod.GET)
    public String hello() {
    	return String.format("{\"message: Hello World!!!\"}");
    }
    
    @RequestMapping(value="/{firstName}/{lastName}", method = RequestMethod.GET)
    public String hello2(@PathVariable("firstName")String firstName, @PathVariable("lastName") String lastName) {
    	return String.format("{\"message\":\"Hello %s %s\"}", firstName, lastName);
    }

}
