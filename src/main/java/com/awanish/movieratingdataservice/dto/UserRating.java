package com.awanish.movieratingdataservice.dto;

import lombok.*;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class UserRating {
    private List<Rating> userRating;
}
