package action.movie;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)

public class MovieData {

    @JsonProperty("provider_moviename")
    private String providerMovieName;

    private String moviePosterUrl;

    private String movieTitle;

    @JsonProperty("movie_name")
    private String movieName;

    private String language;

    private String releaseDate;

    private List<String> genre;

    private int rank;

    private String paytmMovieCode;

    @JsonProperty("isContentAvailable")
    private boolean isContentAvailable;

    private int contentId;

    public String getProviderMovieName() {
        return providerMovieName;
    }

    public void setProviderMovieName(String providerMovieName) {
        this.providerMovieName = providerMovieName;
    }

    public String getMoviePosterUrl() {
        return moviePosterUrl;
    }

    public void setMoviePosterUrl(String moviePosterUrl) {
        this.moviePosterUrl = moviePosterUrl;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List<String> getGenre() {
        return genre;
    }

    public void setGenre(List<String> genre) {
        this.genre = genre;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getPaytmMovieCode() {
        return paytmMovieCode;
    }

    public void setPaytmMovieCode(String paytmMovieCode) {
        this.paytmMovieCode = paytmMovieCode;
    }

    public boolean isContentAvailable() {
        return isContentAvailable;
    }

    public void setContentAvailable(boolean contentAvailable) {
        isContentAvailable = contentAvailable;
    }

    public int getContentId() {
        return contentId;
    }

    public void setContentId(int contentId) {
        this.contentId = contentId;
    }

    @Override
    public String toString() {
        return "MovieData{" +
                "providerMovieName='" + providerMovieName + '\'' +
                ", moviePosterUrl='" + moviePosterUrl + '\'' +
                ", movieTitle='" + movieTitle + '\'' +
                ", movieName='" + movieName + '\'' +
                ", language='" + language + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", genre=" + genre +
                ", rank=" + rank +
                ", paytmMovieCode='" + paytmMovieCode + '\'' +
                ", isContentAvailable=" + isContentAvailable +
                ", contentId=" + contentId +
                '}';
    }
}
