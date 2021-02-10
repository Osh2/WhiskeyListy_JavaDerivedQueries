package com.example.codeclan.whiskeyListy.repositories;

import com.example.codeclan.whiskeyListy.models.Distillery;
import com.example.codeclan.whiskeyListy.models.Whisky;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DistilleryRepository extends JpaRepository<Distillery, Long> {

    List<Distillery> findByRegionIgnoreCase(String region);


    List<Distillery> findWhiskeysByAge(int age);
}
