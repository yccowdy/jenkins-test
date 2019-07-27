package com.yangcc1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    final String A="/ycc";
    @RequestMapping(A)
	public String f(){
    	return "ycc";
	}
}

