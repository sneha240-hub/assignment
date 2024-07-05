package Utility;

import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PUTMethod {
	
	public Response PutRequest() {
		RestAssured.baseURI=  "http://10.82.180.36:8080/rest-session-demo/api";
		RequestSpecification request = RestAssured.given();
		//informing the type of file
		request.header("Content-type","application/json");
		
		JSONObject j=new JSONObject();
		  j.put("name","Sneha");
		  j.put("rollNo",20);
		  j.put("std","V");
		  
		  request.body(j.toString());
		  //updating to the link
		  Response res=request.request(Method.PUT,"/student");
		  System.out.println(res.getBody().asString());
		return res;
		  
		
	}

}
