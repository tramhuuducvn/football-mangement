package com.example.footballmanagement.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.footballmanagement.payload.response.ClubResponse;

@Service
public class ClubService {
    public List<ClubResponse> getAll() {
        List<ClubResponse> list = new ArrayList<>();
        for (int i = 0; i < 10; ++i) {
            list.add(this.getById(i));
        }

        return list;
    }

    /**
     * Get football club information by id
     * 
     * @param id
     * @return FootballClubResponse
     */
    public ClubResponse getById(long id) {
        Date date = new Date(1878, 1, 1);
        return new ClubResponse("Manchester United F.C.", "MU", date, null, null, null);
    }
}
