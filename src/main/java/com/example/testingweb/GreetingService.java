package com.example.testingweb;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
	public static final String GREETINGS = "Finaliza el curso DevOps Foundation v2 - Lourdes Torres";
	public String greet() {
		return GREETINGS;
	}
}
