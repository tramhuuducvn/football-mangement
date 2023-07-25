package com.example.footballmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.footballmanagement.entity.Club;

public interface ClubRepository extends JpaRepository<Club, Long> {

}
