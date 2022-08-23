package com.zeroToHero.spring24logging.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class LearnStunden {
    @Id
    private Long id;
    private Long classStunden;


}
