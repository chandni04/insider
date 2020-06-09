package action.movie;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

public class MovieDataAction {
    private ObjectMapper mapper = new ObjectMapper();

    public void checkStatusCode(String baseURl, String endPoint) {
        RestAssured.baseURI = baseURl;
        RequestSpecification httpRequest = RestAssured.given().log().all();
        Response response = httpRequest.request(Method.GET, endPoint);
        int statusCode = response.statusCode();
        System.out.println("status code " + statusCode);
        Assert.assertEquals(statusCode, 200);
    }

    public void movieReleasedate(String baseURl, String endPoint) {
        RestAssured.baseURI = baseURl;
        RequestSpecification httpRequest = RestAssured.given().log().all();
        Response response = httpRequest.request(Method.GET, endPoint);
        MovieDataWrapper movieDataWrapper = null;
        String responseBody = response.getBody().asString();
        try {
            movieDataWrapper = mapper.readValue(responseBody, MovieDataWrapper.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<MovieData> upcomingMovieData = movieDataWrapper.getUpcomingMovieData();
        for (int i = 1; i < upcomingMovieData.size(); i++) {
            MovieData data = upcomingMovieData.get(i);
            LocalDate now = LocalDate.now();
            String date = data.getReleaseDate();
            if (date == null) {
                System.out.println("release date is not present for movie :" + data.getMovieName());
            } else {
                LocalDate localDate = LocalDate.parse(date);
                if (localDate.isBefore(now) || localDate.isEqual(now)) {
                    Assert.fail("Invalid release date");
                }
            }
        }

    }
}
