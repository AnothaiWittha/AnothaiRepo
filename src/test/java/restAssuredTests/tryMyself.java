package restAssuredTests;

import org.junit.Assert;
import org.junit.Test;

//add static and at the end add .* to not store variables
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class tryMyself {
	
	@Test
	public void testTrytMyself() {
							
							//variable like this doesn't have to store
		//Response response =RestAssured.get("https://reqres.in/api/users?page=2");
		Response response  = get("https://reqres.in/api/users?page=2");
		
		
		System.out.println(response.getStatusCode());
		System.out.println(response.asString());
		
		System.out.println(response.getBody());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content-type"));
		System.out.println(response.getTime());
		
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
	}
	
	
	
	@Test
	public void test2() {
		given()
		.get("https://reqres.in/api/users?page=2")
		.then()
		.statusCode(200)
		.body("data.id[0]",equalTo(7));
	}
	
	
	

}
