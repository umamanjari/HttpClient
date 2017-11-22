package com.wbl.api_automation.helper;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

//import org.codehaus.groovy.transform.EqualsAndHashCodeASTTransformation;
import org.testng.annotations.Test;


public class RestAssuredAPITest {
	
	@Test
	public void get()
	{
		
		given().when().get("https://api.qa.talentscreen.io/v1/subjects").then().statusCode(200)
		.body("[1].id",equalTo(3))
		.body("[1].name",equalTo("Python"));
		
		
	}
	
	@Test
	public void get1()
	{
		
		given().when().get("https://api.qa.talentscreen.io/v1/subjects").then().statusCode(200)
		.body("[0].id",equalTo(2))
		.body("[0].lastmoduserid",equalTo(99999));
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
