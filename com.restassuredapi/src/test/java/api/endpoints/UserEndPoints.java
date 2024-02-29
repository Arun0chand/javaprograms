package api.endpoints;


import org.testng.annotations.Test;

import api.payload.User;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UserEndPoints {
	
	public static Response createUser(User payload){
		Response response=given()
				
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(payload)
		.when()
		.post(Routes.post_url);
		
		return response;
	}

	public static Response readUser(String userName){
		Response response=given()
		.pathParam("username", userName)
		.when()
		.get(Routes.get_url);
		
		return response;
	}
	
	public static Response deleteUser(String userName){
		Response response=given()
				
		.pathParam("username", userName)
		.when()
		.delete(Routes.delete_url);
		
		return response;
	}
}
