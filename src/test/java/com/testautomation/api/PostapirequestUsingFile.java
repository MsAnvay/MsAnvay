package com.testautomation.api;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.testng.annotations.Test;

import com.apitesting.utils.Filenameconstance;



import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
                                       //Modul Name -- City
public class PostapirequestUsingFile {
	
	@Test(priority = 1)
	public void Creatcity() {
		
		try {
			String postapirequestBody =FileUtils.readFileToString(new File(Filenameconstance.POST_API_REQUEST_BODY),"UTF-8");
			
			System.out.println(postapirequestBody );
			
			Response response= 	
					RestAssured
					.given().contentType(ContentType.JSON)
					.body(postapirequestBody )
					.baseUri("http://api.micro-logic.in/Companies/SaveCompanies")
					.when().post()
					.then().log().all(true)
					.assertThat()
					.statusCode(200).extract()
					.response();
			

			System.out.println("Response time in MS:"  + response.getTime());
			System.out.println("Test is pass:"  + response.statusCode() );
			System.out.println("Respose body:" +  response.asPrettyString());
		
		
	
		
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	    @Test(priority = 2)
        public void updatecity() {
	    	
	    	try {
				String postapirequestBody =FileUtils.readFileToString(new File(Filenameconstance.POST_API_REQUEST_BODY),"UTF-8");
				
				System.out.println(postapirequestBody );
			Response response= 	
			RestAssured
			.given().contentType(ContentType.JSON)
			.body(postapirequestBody )
			.baseUri("http://api.micro-logic.in/Companies/SaveCompanies")
			.when().post()
			.then().log().all(true)
			.assertThat()
			.statusCode(200).extract()
			.response();
			
			System.out.println("Response time in MS:"  + response.getTime());
			System.out.println("Test is pass:"  + response.statusCode() );
			System.out.println("Respose body:" +  response.asPrettyString());
		
			
			
				} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	
	    	
	    }
	    @Test(priority = 3)	
	  public void Deletecity() {
	    	try {
				String postapirequestBody =FileUtils.readFileToString(new File(Filenameconstance.POST_API_REQUEST_BODY),"UTF-8");
				
				System.out.println(postapirequestBody );
			Response response= 	
			RestAssured
			.given().contentType(ContentType.JSON)
			.body(postapirequestBody )
			.baseUri("http://api.micro-logic.in/Cities/DeleteCity")
			.when().post()
			.then().log().all(true)
			.assertThat()
			.statusCode(200).extract()
			.response();
			
			System.out.println("Response time in MS:"  + response.getTime());
			System.out.println("Test is pass:"  + response.statusCode() );
			System.out.println("Respose body:" +  response.asPrettyString());
		
			
			
				} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	
		  
		
		  }
		 @Test(priority = 4) 
		public void Getcity() {
			 Response response=
			 RestAssured
			  .given().baseUri("http://api.micro-logic.in/Cities/GetCitiesList").param("companyID","1").param("IsActive","Y").param("CityID","2")
			         .when().get().then().assertThat().log().all().statusCode(200).extract().response();
			
			 System.out.println("Response time in MS:"  + response.getTime());
				System.out.println("Test is pass:"  + response.statusCode() );
				System.out.println("Respose body:" +  response.asPrettyString());
			
			
		 }	
		@Test(priority = 5)  
		public void Getcitydropdown() {
			
			
			 Response response=
					 RestAssured
					  .given().baseUri("http://api.micro-logic.in/Cities/GetCitiesList").param("companyID","1").param("IsActive","Y").param("strColumnValue","H")
					         .when().get().then().assertThat().log().all().statusCode(200).extract().response();
					
					 System.out.println("Response time in MS:"  + response.getTime());
						System.out.println("Test is pass:"  + response.statusCode() );
						System.out.println("Respose body:" +  response.asPrettyString());
					
					
			
			
			
			
			
		}
		  
	  
	    	
	    	
	    	
	   
	    
	    
	    	
	    	
	    
}
