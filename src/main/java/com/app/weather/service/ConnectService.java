package com.app.weather.service;

import com.mashape.unirest.http.HttpResponse;

public interface ConnectService {
	public HttpResponse<String> connectApi() throws Exception;
}
