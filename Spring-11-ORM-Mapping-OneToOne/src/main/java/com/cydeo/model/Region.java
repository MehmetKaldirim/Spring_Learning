package com.cydeo.model;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="regions")
@NoArgsConstructor
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long regionId;
    private String region;

    @OneToOne(mappedBy = "region")
    private Employee employee;

    private String country;

    public Region(String region, String country) {
        this.region = region;
        this.country = country;
    }
}
