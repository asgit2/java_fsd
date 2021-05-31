package com.ibm.SpringStarter;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("/msg")
	String getMessage() {
		return "Getting Started with spring Boot";
	}
	@RequestMapping("/getmsg")
	List<String> getList(){
		return Arrays.asList("Hi", "I", "am", "Abhishek", "Ghosh");
	}
}
