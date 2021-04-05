package com.app.weather.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;

public class ConnectServiceImpl implements ConnectService{
	public HttpResponse<String> connectApi() throws Exception {
		HttpResponse<String> response;
		response = Unirest.get("https://community-open-weather-map.p.rapidapi.com/weather?q=London%2Cuk&lat=0&lon=0&callback=test&id=2172797&lang=null&units=%22metric%22%20or%20%22imperial%22&mode=xml%2C%20html")
				.header("x-rapidapi-key", "7d05a4d63cmsh5f2894272c984e7p1464d5jsn08c3ad3a2025")
				.header("x-rapidapi-host", "community-open-weather-map.p.rapidapi.com")
				.asString();
		
		return response;
	}
}
