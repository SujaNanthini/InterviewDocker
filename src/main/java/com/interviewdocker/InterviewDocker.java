package com.interviewdocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InterviewDocker {
	
		@GetMapping(path = "/val1")
		public String getMsg1() {
			return "Hello 2024";
		}

}
