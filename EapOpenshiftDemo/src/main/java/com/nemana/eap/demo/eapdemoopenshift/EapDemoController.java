package com.nemana.eap.demo.eapdemoopenshift;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class EapDemoController {

	@GetMapping("/{name}")
	public String getGreetings(@PathVariable String name) {
		
		return "Hello openshift, this is my first eap application: from :" +name;
	}
}
