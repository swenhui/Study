package com.rest;


import org.codehaus.jackson.jaxrs.JacksonJsonProvider;
import org.glassfish.jersey.server.ResourceConfig;

public class RestApplication extends ResourceConfig{

	public RestApplication() {
		packages("com.rest.resource");
		
		// 注册JSON转换器
	    register(JacksonJsonProvider.class);
	}

	
}
