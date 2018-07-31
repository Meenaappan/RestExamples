package com;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/Hello")
public class Rest {

	@GET
	@Path("/Hello")
	@Produces(MediaType.TEXT_PLAIN)
	public String getMessage(){
		
		return "Hello";
	}
}
