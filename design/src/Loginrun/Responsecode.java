package Loginrun;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;
import static com.jayway.restassured.RestAssured.given;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;


public class Responsecode {
	
	public void checkHttpResponseCode(String url) {
        //Response response =given().get(url).then().extract().response();
		
		Response resp = given().get("").thenReturn().
 
        System.out.println(response.getStatusCode());
    }
	

	public static void main(String[] args) {
		

}
}

