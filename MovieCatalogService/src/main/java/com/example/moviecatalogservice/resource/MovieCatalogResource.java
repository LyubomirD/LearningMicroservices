package com.example.moviecatalogservice.resource;

import com.example.moviecatalogservice.model.CatalogItem;
import com.example.moviecatalogservice.model.Movie;
import com.example.moviecatalogservice.model.UserRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

    @Autowired
    private RestTemplate restTemplate;

    // synchronised
    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable String userId) {
        UserRating ratings = restTemplate.getForObject("http://Rating-Data-Service/ratingdata/users/" + userId, UserRating.class);

        return ratings.getUserRating().stream().map(rating -> {
            // Rest template
            // For each movieId, call MovieInfoService and get details
            Movie movie = restTemplate.getForObject("http://Movie-Info-Service/movies/" + rating.getMovieId(), Movie.class);
            // Put all the gather information together
            return new CatalogItem(movie.getName(), "Test", rating.getRating());
        }).collect(Collectors.toList());
    }
}
