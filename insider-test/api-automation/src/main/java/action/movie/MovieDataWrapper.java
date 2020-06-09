package action.movie;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)

public class MovieDataWrapper {
    private List<MovieData> upcomingMovieData;

    public List<MovieData> getUpcomingMovieData() {
        return upcomingMovieData;
    }

    public void setUpcomingMovieData(List<MovieData> upcomingMovieData) {
        this.upcomingMovieData = upcomingMovieData;
    }
}

