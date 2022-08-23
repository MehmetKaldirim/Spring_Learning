package com.zeroToHero.spring24logging;

import com.zeroToHero.spring24logging.entity.LearnStunden;
import com.zeroToHero.spring24logging.repository.LearnStundenRepository;
import com.zeroToHero.spring24logging.service.LearnStundenService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.Optional;

@SpringBootApplication
public class Spring24LoggingApplication {
    private final LearnStundenRepository learnStundenRepository;
    private final LearnStundenService learnStundenService;

    public Spring24LoggingApplication(LearnStundenRepository learnStundenRepository, LearnStundenService learnStundenService) {
        this.learnStundenRepository = learnStundenRepository;
        this.learnStundenService = learnStundenService;
    }

    public static void main(String[] args) {
        SpringApplication.run(Spring24LoggingApplication.class, args);
    }

    @PostConstruct()
    public void postConstruct() {
        LearnStunden project = new LearnStunden(1L, 120L);
        learnStundenService.save(project);

        Optional<LearnStunden> optionalProject = learnStundenService.findById(1L);
        optionalProject.ifPresent(System.out::println);
    }
}
