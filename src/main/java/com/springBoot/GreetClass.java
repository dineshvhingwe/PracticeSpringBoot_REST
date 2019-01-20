package com.springBoot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/greet")
public class GreetClass 
{
	@GetMapping(value="/simple",produces="application/xml")  ///note it @GetMapping  similar to RequestMapping
	public String greetSimple()
	{
		return "Hello User. This is First Spring boot REST WS!!";
	}

}
