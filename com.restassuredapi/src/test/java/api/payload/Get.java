package api.payload;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

public class Get 
{

	@Test
	
	public void getTest() {
		
		given()
		.header("Authorization", "Bearer", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX2lkIjoxLCJjbGllbnRfdHlwZSI6MSwiZW1haWxfaWQiOiJhZG1pbkBvcGVuZC5jb20iLCJicm93c2VyIjoiZmlyZWZveCIsImNyZWF0ZWRfZGF0ZSI6IjIwMjMtMTAtMTggMTc6NDY6MzUuNjQ0NzUxKzA1OjMwIiwib3MiOiJ3aW5kb3dzIiwiZGV2aWNlIjoiIiwiaXAiOiIxMzQuMjA5LjIzLjE3IiwidXNlcl9hZ2VudCI6IlBvc3RtYW5SdW50aW1lLzcuMzMuMCIsImlhdCI6MTY5NzYzMTM5NSwiZXhwIjoxNjk3NjMzMTk1fQ.vqkxQE4E565o0jwiOW6ad09MHTK8Hh030im4jmBbUIs")
		
		.when()
		.get("https://v3opend-api.tech-active.com/advertiser/list_advertiser_profile?advertiser_id=157")
		
		.then()
		.log().all();
	}
}
