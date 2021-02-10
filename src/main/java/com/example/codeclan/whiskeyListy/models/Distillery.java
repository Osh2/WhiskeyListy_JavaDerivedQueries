package com.example.codeclan.whiskeyListy.models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "distilleries")
public class Distillery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String region;

    @JsonIgnoreProperties("distillery")
    @OneToMany(mappedBy = "distillery")
    private List<Whisky> whiskeys;

    public Distillery(String name, String region) {
        this.name = name;
        this.region = region;
        this.whiskeys = new ArrayList<>();
    }

    public Distillery() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public List<Whisky> getWhiskeys() {
        return whiskeys;
    }

    public void setWhiskeys(List<Whisky> whiskies) {
        this.whiskeys = whiskies;
    }
}
