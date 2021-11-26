package com.ash.moviecatalogservice.services;

import com.ash.moviecatalogservice.models.Rating;
import com.ash.moviecatalogservice.models.UserRating;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class UserRatingInfo {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "getFallbackUserRating")
    public UserRating getUserRating(@PathVariable("userId") String userId) {
        return restTemplate.getForObject("http://ratings-data-service/ratingsdata/user/" + userId, UserRating.class);
    }
    // fallback for Rating
    private UserRating getFallbackUserRating(@PathVariable("userId") String userId){
        UserRating userRating = new UserRating();
        userRating.setUserId(userId);
        userRating.setRatings(List.of(new Rating("0", 0)));
        return userRating;
    }
}
