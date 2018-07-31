package com;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

//{rest/REST/REST}

@Path("/REST")
public class myrest {

	@GET
	@Path("/REST")
	@Produces("application/json")
    public String getMessage(){
	
	String jsonInput = "{\"custmer\":\"Java2novice\",\"address\":\"Bangalore\",\"bill-amount\":\"$2000\"}";
	return jsonInput;
	}
	
}
