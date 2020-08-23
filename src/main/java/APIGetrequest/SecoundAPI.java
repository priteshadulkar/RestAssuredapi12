package APIGetrequest;

import com.jayway.restassured.response.Response;
import static  com.jayway.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class SecoundAPI {

	//@Test
	public void Apigetrequest()
	{
		Response resp = when().get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=439d4b804bc8187953eb36d2a8c26a02");
		
		System.out.println(resp.getStatusCode());
		
	}
	
	@Test
	public void Parametgetrequest()
	{
		Response resp = given().param("id","2172797").
				     param("appid", "d30f241bf955cf598d3235c7912321e9").
				     when().get("https://samples.openweathermap.org/data/2.5/weather");
		
		System.out.println(resp.asString());
				
				//when().get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=439d4b804bc8187953eb36d2a8c26a02");
		
		System.out.println(resp.getStatusCode());
		
	}
	
}
