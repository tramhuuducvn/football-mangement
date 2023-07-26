package com.example.footballmanagement.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.footballmanagement.entity.Club;

@Repository
@Transactional
public interface ClubRepository extends JpaRepository<Club, Long> {

}
