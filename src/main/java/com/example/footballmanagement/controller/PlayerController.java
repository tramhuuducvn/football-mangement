package com.example.footballmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.footballmanagement.entity.Player;
import com.example.footballmanagement.repository.PlayerRepository;

@Controller
@RequestMapping("/football-player")
public class PlayerController {
    @Autowired
    private PlayerRepository playerRepository;

    @GetMapping(value = "")
    public List<Player> getAll() {
        return playerRepository.findAll();
    }
}
