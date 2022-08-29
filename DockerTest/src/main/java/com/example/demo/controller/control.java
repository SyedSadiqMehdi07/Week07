package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.hello;


public class control {
	 @RequestMapping(value = "/docker", method = RequestMethod.GET)
public hello sayHi()
{
		 hello hi=new hello();
		 hi.setHello1("hello1");
	return "hi";
}
}
