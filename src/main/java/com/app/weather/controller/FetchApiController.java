package com.app.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.weather.service.ConnectService;
import com.mashape.unirest.http.HttpResponse;

@Controller
public class FetchApiController {
	
	@Autowired
	ConnectService connectService;
	
	@RequestMapping(value = "/get/", method = RequestMethod.GET)
	public ResponseEntity<String> fetchApi() throws Exception {
		HttpResponse<String> results = connectService.connectApi();
		
		return new ResponseEntity<String>(results.getBody(), HttpStatus.OK);
	}
}


