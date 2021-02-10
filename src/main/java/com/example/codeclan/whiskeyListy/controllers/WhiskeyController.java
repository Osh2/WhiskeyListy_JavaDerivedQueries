package com.example.codeclan.whiskeyListy.controllers;

import com.example.codeclan.whiskeyListy.models.Whisky;
import com.example.codeclan.whiskeyListy.repositories.DistilleryRepository;
import com.example.codeclan.whiskeyListy.repositories.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WhiskeyController {

    @Autowired
    WhiskyRepository whiskyRepository;

    @Autowired
    DistilleryRepository distilleryRepository;

    @GetMapping("/whiskeys")
    public ResponseEntity<List<Whisky>> getAllWhiskies() {
        return new ResponseEntity<>(whiskyRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/whiskeys/{year}")
    public ResponseEntity<List<Whisky>> getWhiskyByYear(@PathVariable int year) {
        return new ResponseEntity<>(whiskyRepository.findByYear(year), HttpStatus.OK);
    }


}
