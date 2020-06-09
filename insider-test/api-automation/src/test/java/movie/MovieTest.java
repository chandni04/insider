package movie;

import action.movie.MovieDataAction;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MovieTest {
    @Test
    @Parameters({"baseurl"})
    public void checkStatusCode(String baseurl) {
        MovieDataAction movie=new MovieDataAction();
        movie.checkStatusCode(baseurl,"v2/movies/upcoming");

    }
    @Test
    @Parameters({"baseurl"})
    public void checkReleaseMovieDate(String baseurl) {
        MovieDataAction movie = new MovieDataAction();
        movie.movieReleasedate(baseurl,"v2/movies/upcoming");
    }
}
