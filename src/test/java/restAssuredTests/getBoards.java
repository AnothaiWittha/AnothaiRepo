package restAssuredTests;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class getBoards {

	
	String APIKEY ="d2394acc4288fe1b9742e60e0c1ff998";
	
	String OAuthToken = "ATTA5c18ec5034f9abb7c76c154424b5456b3e50cf16035bb968a80595862526fb98163084CF";
			
	@Test
	public void getBoards() {
		
		//set the base URL
		RestAssured.baseURI ="https://api.trello.com/1/members/me/boards";
		
		//create request object
		RequestSpecification httpRequest = RestAssured.given();
		
		Response myResponse = httpRequest.get(RestAssured.baseURI+ "?key=" + APIKEY + "&token=" + OAuthToken);
		
		System.out.println(myResponse.prettyPrint());
		
		Assert.assertEquals(200, myResponse.getStatusCode());
		
	
	}
	
	
	
	@Test
	public void testrytMyself() {
		
		Response response =RestAssured.get("https://reqres.in/api/users?page=2");
		
		System.out.println(response.getStatusCode());
		System.out.println(response.asString());
		
		System.out.println(response.getBody());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content-type"));
		System.out.println(response.getTime());
		
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
	}
	
	
	
	
	
	
	
}
