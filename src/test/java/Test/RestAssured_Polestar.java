package Test;

import org.testng.annotations.Test;

import Utility.DeleteMethod;
import Utility.GETMethod;
import Utility.PUTMethod;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssured_Polestar {
  @Test(priority = 0)
  public void getReq() {
	  GETMethod get = new GETMethod();
	  
	  String  baseURIget="http://10.82.180.36:8080/AmigoWallet/RegistrationAPI/getAllQuestions";
	  Response r= get.getRequest(baseURIget);
	  System.out.println("Getting GET Method ---- "+r.prettyPrint());
  
	  
  }
  
  @Test(priority = 1)
	public void putReq()
	{
		PUTMethod put=new PUTMethod();
		String baseURIPUT="http://10.82.180.36:8080/rest-session-demo/api/student";
		Response r=put.PutRequest();
		System.out.println("Response for PUT :------- "+ r.prettyPrint());
	}
  
  @Test(priority = 3)
  public void deleteReq() {
	  DeleteMethod del = new DeleteMethod();
	  String baseURIdel="http://10.82.180.36:8080/rest-session-demo/api/student";
		Response r=del.DeleteRequest(baseURIdel);
		System.out.println("Response for Delete------ : "+ r.prettyPrint());
  }
  
}
