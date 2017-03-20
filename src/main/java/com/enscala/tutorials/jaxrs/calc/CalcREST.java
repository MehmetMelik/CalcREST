package com.enscala.tutorials.jaxrs.calc;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/calc")
public class CalcREST {

	@GET
	@Path("/add/{a}/{b}")
	@Produces(MediaType.APPLICATION_JSON)
	public String add(@PathParam("a") double a, @PathParam("b") double b) {
		return "{ \"result\":\"" + (a+b) + "\" }";
	}
	
	@GET
	@Path("/sub/{a}/{b}")
	@Produces(MediaType.APPLICATION_JSON)
	public String sub(@PathParam("a") double a, @PathParam("b") double b) {
		return "{ \"result\":\"" + (a-b) + "\" }";
	}

	@GET
	@Path("/mult/{a}/{b}")
	@Produces(MediaType.APPLICATION_JSON)
	public String mult(@PathParam("a") double a, @PathParam("b") double b) {
		return "{ \"result\":\"" + (a*b) + "\" }";
	}

}
