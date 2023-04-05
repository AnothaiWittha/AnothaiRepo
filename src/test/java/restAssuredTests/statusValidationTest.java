package restAssuredTests;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

import static org.hamcrest.Matchers.*;

public class statusValidationTest {
	
	String APIkey ="d2394acc4288fe1b9742e60e0c1ff998";
	
	String OAuthToken = "ATTA5c18ec5034f9abb7c76c154424b5456b3e50cf16035bb968a80595862526fb98163084CF";

	
	@Test
	public void validationDate() {
		
		RequestSpecification httpRequest = RestAssured.given();
		
		httpRequest.given().param("key", APIkey)
		.param("token", OAuthToken)
		.param("https://api.trello.com/1/members/me/boards")
		.then()
		.statusCode(200)
		.body("name", hasItems("restAssuredBoard"))
		.body("id", equalTo("6424de6e20434ee03d36eba8"));
		
		
		
	}
}
