package com.example.testingweb;

import org.springframework.stereotype.Service;

public static final String GREETINGS = "Finaliza el curso DevOps Foundation v2 - Lourdes Torres";

@Service
public class GreetingService {
	public String greet() {
		return GREETINGS;
	}
}
