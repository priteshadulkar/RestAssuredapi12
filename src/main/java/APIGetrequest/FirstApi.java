package APIGetrequest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.*;
public class FirstApi {

	// simple getting whether api get request by city name
	//@Test
	public void getrequest()
	{
		com.jayway.restassured.response.Response resp =  when().get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=d30f241bf955cf598d3235c7912321e9");
		
	 int code=	  resp.getStatusCode();  
	 System.out.println(code);
	 
	 Assert.assertEquals(code, 200);
	 
	 }
	
	//api rest testing 
	//@Test
	public void getsmoke()
	{
		given().
		param("q", "London").
		param("appid","d30f241bf955cf598d3235c7912321e9").
		when().get("https://samples.openweathermap.org/data/2.5/weather").
		then().
		assertThat().statusCode(200);
		
		
	}
	
	//@Test
	public void Readjsonfile()
	{
		com.jayway.restassured.response.Response resp = given().
		param("q", "London").
		param("appid","d30f241bf955cf598d3235c7912321e9").
		when().get("https://samples.openweathermap.org/data/2.5/weather");
		
		System.out.println(resp.asString());
		
		
	}
	
	@Test
	public void Readjsonfileid()
	{
		com.jayway.restassured.response.Response resp = given().
		param("id", "2172797").
		param("appid","d30f241bf955cf598d3235c7912321e9").
		when().get("https://samples.openweathermap.org/data/2.5/weather");
		
		System.out.println(resp.asString());
		
		
	}
	
}
