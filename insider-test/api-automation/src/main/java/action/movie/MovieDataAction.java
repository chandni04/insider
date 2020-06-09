package action.movie;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;

public class MovieDataAction {

    public void checkStatusCode(String baseURl, String endPoint) {
        RestAssured.baseURI = baseURl;
        RequestSpecification httpRequest = RestAssured.given().log().all();
        Response response = httpRequest.request(Method.GET, endPoint);
        int statusCode = response.statusCode();
        System.out.println("status code " + statusCode);
        Assert.assertEquals(statusCode, 200);
    }
}
