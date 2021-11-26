package com.ash.moviecatalogservice.resources;

import com.ash.moviecatalogservice.models.CatalogItem;
import com.ash.moviecatalogservice.models.Movie;
import com.ash.moviecatalogservice.models.Rating;
import com.ash.moviecatalogservice.models.UserRating;
import com.ash.moviecatalogservice.services.MovieInfo;
import com.ash.moviecatalogservice.services.UserRatingInfo;
import com.netflix.discovery.DiscoveryClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class CatalogResource {

    // Services 1
    @Autowired
    private RestTemplate restTemplate;

    // Service 2
    @Autowired
    WebClient.Builder webClientBuilder;

    // Service 3
    @Autowired
    MovieInfo movieInfo;

    // Service 4
    @Autowired
    UserRatingInfo userRatingInfo;

    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {
        UserRating userRating = userRatingInfo.getUserRating(userId);
        return userRating.getRatings().stream()
                .map(rating -> movieInfo.getCatalogItem(rating))
                .collect(Collectors.toList());
    }
}


//                    Movie movie = webClientBuilder.build()
//                            .get()
//                            .uri("http://localhost:8082/movies/" + rating.getMovieId())
//                            .retrieve()
//                            .bodyToMono(Movie.class)
//                            .block();