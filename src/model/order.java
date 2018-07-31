package model;
import org.codehaus.jackson.annotate.JsonProperty;
public class order {

		@JsonProperty("custmer")
	    private String custmer;
	 
	 	/*@JsonProperty("address")    
	    private String address;
	     
	    @JsonProperty("bill-amount")
	    private String amount;*/
	     
	    public String getCustmer() {
	        return custmer;
	    }
	    public void setCustmer(String custmer) {
	        this.custmer = custmer;
	    }
	     
	   /* public String getAddress() {
	        return address;
	    }
	    public void setAddress(String address) {
	        this.address = address;
	    }
	     
	    public String getAmount() {
	        return amount;
	    }
	    public void setAmount(String amount) {
	        this.amount = amount;
	    }*/
}
