package apitest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.github.dockerjava.transport.DockerHttpClient.Response;

import io.restassured.RestAssured;
import io.restassured.response.ResponseOptions;

public class Apitest {
	
	@Test
	public void test() {
		Response rs=(Response) RestAssured.get("https://reqres.in/api/users?page=2");
		rs.getStatusCode();
		System.out.println(rs.getStatusCode());
	
	
		
	}

}
