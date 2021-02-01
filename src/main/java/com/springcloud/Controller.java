package com.springcloud;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {
	@GetMapping("/coffees/{param}")
	public List<String> getConffees(@PathVariable String param) {
		if(!"pass".equalsIgnoreCase(param)) {
			try {
				Thread.sleep(1000);
			} catch(Exception e) {}
		}
		
		return Arrays.asList("Americano", "Latte", "Mocha");
	}
}
