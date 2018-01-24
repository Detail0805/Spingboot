package com.springboot.jpa.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Hello {
	@RequestMapping(value = { "/hello" })
	public String hello() {
		return "Hello SpringBoot22";
	}
}
