package com.demo.service;

import java.util.concurrent.CompletableFuture;

import org.springframework.stereotype.Service;

@Service
public class MyService 
{
	public CompletableFuture<String> api1()
	{
		return CompletableFuture.supplyAsync(() -> "str1");
	}
	public CompletableFuture<String> api2()
	{
		return CompletableFuture.supplyAsync(() -> "str2");
	}
	public CompletableFuture<String> api3()
	{
		return CompletableFuture.supplyAsync(() -> "str3");
	}
	public CompletableFuture<String> getagg()
	{
		return api1().thenCombine(api2(), (e1, e2)-> e1+e2 )
				.thenCombine(api3(), (e3, e4) -> e3+e4);
	}

}
