package Utility;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteMethod {
	public Response DeleteRequest(String BaseURI)
	{
		RestAssured.baseURI = BaseURI;
		RequestSpecification req = RestAssured.given();
		Response res=req.request(Method.DELETE,"/student/delete?rollNo=101");
		return res;
	}
}
