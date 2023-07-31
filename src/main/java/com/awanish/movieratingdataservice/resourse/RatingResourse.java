package com.awanish.movieratingdataservice.resourse;

import com.awanish.movieratingdataservice.dto.Rating;
import com.awanish.movieratingdataservice.dto.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingResourse {

    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId) {
        return Rating.builder()
                .movieId(movieId)
                .rating(4)
                .build();
    }

    @RequestMapping("/user/{userId}")
    public UserRating getUserRatings(@PathVariable("userId") String userId) {
        List<Rating> ratings = Arrays.asList(
                Rating.builder()
                        .movieId("100")
                        .rating(4)
                        .build(),
                Rating.builder()
                        .movieId("200")
                        .rating(3)
                        .build()
        );


        return UserRating.builder().userRating(ratings).build();
    }




}
