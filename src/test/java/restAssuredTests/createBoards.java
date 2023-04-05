package restAssuredTests;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class createBoards {


	String APIkey ="d2394acc4288fe1b9742e60e0c1ff998";
	
	String OAuthToken = "ATTA5c18ec5034f9abb7c76c154424b5456b3e50cf16035bb968a80595862526fb98163084CF";
	String boardName = "restAssuredBoard";
	
	@Test
	public void creatBoard() {
		
		//set the base URL
				RestAssured.baseURI ="https://api.trello.com/1/boards";
				
				//create request object
				RequestSpecification httpRequest = RestAssured.given();
				
				httpRequest.header("Content-Type", "application/json");
				
				Response myResponse = httpRequest.post(RestAssured.baseURI+"/?name="+boardName+"&key="+APIkey+"&token="+OAuthToken);
			int statusCode = myResponse.getStatusCode();
			
			
			Assert.assertEquals(200, statusCode);
			System.out.println("The test pass: " + statusCode);
		
	}
	
	
}
