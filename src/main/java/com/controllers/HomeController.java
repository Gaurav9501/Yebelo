package com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.DAO.*;
import com.Entity.*;
import com.Service.APIService;

@RestController
@RequestMapping("/FetchNextNumber")
public class HomeController {
	
	@Autowired
	APIService service;
	@Autowired
	APIJPA jpa;
	
	@PostMapping("/")
	public ResponseData FetchNumber(@RequestBody JsonFetch code) {
		try {
		data fcode = jpa.getById(code.getCode());
		int oldValue = fcode.getValue();
		int newValue = this.service.getNewCode(fcode.getValue());
		Thread.sleep(50000);
		fcode.setValue(newValue);
		jpa.save(fcode);
		return new ResponseData(oldValue,newValue);
		}catch(Exception e) {
			e.printStackTrace();
			return new ResponseData(-1,-1);
		}
	}
	/*
	@PostMapping("/{code}")
	public ResponseData FetchNumber(@PathVariable("code") int code) {
		try {
		data fcode = jpa.getById(code);
		int oldValue = fcode.getValue();
		int newValue = this.service.getNewCode(fcode.getValue());
		Thread.sleep(50000);
		fcode.setValue(newValue);
		jpa.save(fcode);
		return new ResponseData(oldValue,newValue);
		}catch(Exception e) {
			e.printStackTrace();
			return new ResponseData(-1,-1);
		}
	}
	
	
	
	*/


}
