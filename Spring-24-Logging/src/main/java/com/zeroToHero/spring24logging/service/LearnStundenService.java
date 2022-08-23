package com.zeroToHero.spring24logging.service;

import com.zeroToHero.spring24logging.entity.LearnStunden;

import java.util.List;
import java.util.Optional;

public interface LearnStundenService {
    public Optional<LearnStunden> findById(Long Id);
    public LearnStunden save(LearnStunden learnStunden);
}
