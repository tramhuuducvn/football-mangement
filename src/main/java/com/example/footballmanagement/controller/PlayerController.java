package com.example.footballmanagement.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.footballmanagement.entity.Player;
import com.example.footballmanagement.payload.response.PlayerResponse;
import com.example.footballmanagement.repository.PlayerRepository;

@Controller
@RequestMapping("/player")
public class PlayerController {
    @Autowired
    private PlayerRepository playerRepository;

    @GetMapping(value = "")
    public List<Player> getAll() {
        List<Player> list = playerRepository.findAll();
        list.forEach(System.out::println);
        return playerRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    @ResponseBody
    public PlayerResponse getById(@PathVariable Long id) {
        System.out.println("ID variable: " + id);
        return new PlayerResponse(1, "Mr N07", new Date(), "Turkey", 185, "RIGHT", null);
    }
}
