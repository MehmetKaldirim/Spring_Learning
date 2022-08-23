package com.zeroToHero.spring24logging.service.impl;

import com.zeroToHero.spring24logging.entity.LearnStunden;
import com.zeroToHero.spring24logging.repository.LearnStundenRepository;
import com.zeroToHero.spring24logging.service.LearnStundenService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LearnStundenServiceImpl implements LearnStundenService {

    private final LearnStundenRepository learnStundenRepository;

    public LearnStundenServiceImpl(LearnStundenRepository learnStundenRepository) {
        this.learnStundenRepository = learnStundenRepository;
    }

    private static final Logger LOG = LoggerFactory.getLogger(LearnStundenServiceImpl.class);

    @Override
    public Optional<LearnStunden> findById(Long id) {
        LOG.info("Project Service >> Finding Project By Id {}", id);
        return learnStundenRepository.findById(id);
    }

    @Override
    public LearnStunden save(LearnStunden learnStunden) {
        LOG.info("Project Service >> Saving Project", learnStunden);
        return learnStundenRepository.save(learnStunden);
    }




}
