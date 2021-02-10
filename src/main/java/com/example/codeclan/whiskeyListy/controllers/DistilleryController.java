package com.example.codeclan.whiskeyListy.controllers;

import com.example.codeclan.whiskeyListy.models.Distillery;
import com.example.codeclan.whiskeyListy.models.Whisky;
import com.example.codeclan.whiskeyListy.repositories.DistilleryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DistilleryController {

    @Autowired
    DistilleryRepository distilleryRepository;

    @GetMapping("/distilleries")
    public ResponseEntity<List<Distillery>> getAllDistilleries(){
        return new ResponseEntity<>(distilleryRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/distilleries/{region}")
    public ResponseEntity<List<Distillery>> getByRegion(@PathVariable String region){
        return new ResponseEntity<>(distilleryRepository.findByRegionIgnoreCase(region), HttpStatus.OK);
    }

    @GetMapping("/distillery/whiskey/{age}")
    public ResponseEntity<List<Distillery>> getWhiskyFromDistilleryByAge(@PathVariable int age){
        return new ResponseEntity<>(distilleryRepository.findWhiskeysByAge(age), HttpStatus.OK);
    }
}
