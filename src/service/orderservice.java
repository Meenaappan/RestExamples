package service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

//{rest/Order/Order}
@Path("/Order")
public class orderservice {

	@POST
    @Path("/Order")
	@Consumes({"application/json"})
	
   /* public Response getUserById(order inputOrder){
        
        System.out.println("Received order from :"+inputOrder.getCustmer());
        System.out.println("Order worth: "+inputOrder.getAmount());
        System.out.println("Customer address: "+inputOrder.getAddress());
         
        return Response.status(200).entity("Your order is in-progress").build();
    }*/

	public String getMessage(){
		
		String customer="";
		return customer;
	}
	
	
}
