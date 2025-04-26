package com.demo.controller;

import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.service.MyService;

@RestController
@RequestMapping("/test")
public class Controller 
{
	@Autowired
	MyService myService;
	
	@GetMapping("/get")
	public CompletableFuture<String> get()
	{
		return myService.getagg();
	}

}
