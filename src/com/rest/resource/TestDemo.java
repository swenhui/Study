package com.rest.resource;

import javax.annotation.Resource;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.rest.dao.bean.Shop;
import com.rest.service.DemoService;

@Controller
@Path("/demo")
public class TestDemo {
	@Autowired
	private DemoService service;

	@GET
	@Path("/test")
	@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
	public String demo(@QueryParam("name") String name){
		Shop shop = service.getShop(name);
		if(shop==null){
			return "null";
		}
		return shop.getName();
	}
	
	@POST
	@Path("/insert")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
	public int insert(Shop shop){
		
		return service.addShop(shop);
	}
}
