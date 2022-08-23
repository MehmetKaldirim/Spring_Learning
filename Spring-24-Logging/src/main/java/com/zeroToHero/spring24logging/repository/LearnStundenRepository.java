package com.zeroToHero.spring24logging.repository;

import com.zeroToHero.spring24logging.entity.LearnStunden;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LearnStundenRepository extends JpaRepository<LearnStunden, Long> {
}
