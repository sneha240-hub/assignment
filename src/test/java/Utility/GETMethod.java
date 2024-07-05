package Utility;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GETMethod {
	
	public Response getRequest(String BaseURI) {
		
		 RestAssured.baseURI= BaseURI;
		 RequestSpecification request = RestAssured.given();
		 Response r = request.get(); 
		 
		 return r;
	}
	
	
	 
}
