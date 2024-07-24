package com.application.application.run;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

@Repository
public class RunRepository {
    private List<Run> runs = new ArrayList<>();

    List<Run> findAll(){
        return runs;
    }
@PostConstruct
    private void init(){
        runs.add(new Run(1,
                "Wednesday Run",
                LocalDateTime.now(),
                LocalDateTime.now().plus(30, ChronoUnit.MINUTES),
                3,
                Location.OUTDOOR));

    runs.add(new Run(1,
            "Thursday Run",
            LocalDateTime.now(),
            LocalDateTime.now().plus(50, ChronoUnit.MINUTES),
            8,
            Location.OUTDOOR));
}
}
