package com.example.codeclan.whiskeyListy.repositories;

import com.example.codeclan.whiskeyListy.models.Whisky;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WhiskyRepository extends JpaRepository<Whisky, Long> {

    List<Whisky> findByYear(int year);
    List<Whisky> findDistilleryByAge(int age);
}
