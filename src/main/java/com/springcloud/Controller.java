package com.springcloud;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {
	private final Logger log = LoggerFactory.getLogger(getClass());
	
	@GetMapping("/coffees/{param}")
	public List<String> getConffees(@PathVariable String param) {
		log.info("### Received: /coffees/"+param);
		
		if(!"pass".equalsIgnoreCase(param)) {
			try {
				Thread.sleep(1000);
			} catch(Exception e) {}
		}
		
		List<String> list = Arrays.asList("Americano", "Latte", "Mocha");
		log.info("### Sent: "+list.toString());
		
		return list;
	}
}
