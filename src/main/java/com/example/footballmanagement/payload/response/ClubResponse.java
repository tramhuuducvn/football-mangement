package com.example.footballmanagement.payload.response;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ClubResponse {
    private String name;
    private String abbrevName;
    private Date foundingDate;
    private String stadium;
    private String tournament;
    private String about;
}
