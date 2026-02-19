package com.doker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DokerController {
@GetMapping(value="get")
public String g() {
	return "java is a programming language";
}
@GetMapping(value="get2/{a}")
public String f(@PathVariable int a) {
	if(a%2==0) {
		return "even number";
	}
	else {
		return "odd number";
	}
	
}
}
