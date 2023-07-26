package com.example.footballmanagement.repository;

import org.springframework.stereotype.Repository;

import com.example.footballmanagement.entity.Player;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
@Transactional
public interface PlayerRepository extends JpaRepository<Player, Long> {

}