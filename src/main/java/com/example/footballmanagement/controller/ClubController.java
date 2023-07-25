package com.example.footballmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.footballmanagement.payload.response.ClubResponse;
import com.example.footballmanagement.service.ClubService;

@Controller
@RequestMapping("/football-club")
public class ClubController {
    @Autowired
    ClubService footballClubService;

    @GetMapping("")
    public String home(Model model) {
        List<ClubResponse> footballClub = footballClubService.getAll();
        model.addAttribute("footballClubs", footballClub);
        return "index";
    }
}
