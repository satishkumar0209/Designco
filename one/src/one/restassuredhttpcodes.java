package one;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
public class restassuredhttpcodes {
	
	public void checkHttpCode(String url){
		Response resp = given().get(url).then().extract().response();
		
		System.out.println("status code="+resp.getStatusCode());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Added new code
		
		new restassuredhttpcodes().checkHttpCode("http://designco.sia.co.in/");
		
	}
	
}
