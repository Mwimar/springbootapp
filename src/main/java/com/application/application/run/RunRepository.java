package com.application.application.run;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class RunRepository {
    private final List<Run> runs = new ArrayList<>();

    List<Run> findAll(){
        return runs;
    }

    Optional <Run> findById(Integer id){
        return runs.stream().filter(run -> run.id()==id).findFirst();
    };


    void create (Run run){
        runs.add(run);
    }

@PostConstruct
    private void init(){
        runs.add(new Run(1,
                "Wednesday Run",
                LocalDateTime.now(),
                LocalDateTime.now().plus(30, ChronoUnit.MINUTES),
                3,
                Location.OUTDOOR));

    runs.add(new Run(2,
            "Thursday Run",
            LocalDateTime.now(),
            LocalDateTime.now().plus(50, ChronoUnit.MINUTES),
            8,
            Location.OUTDOOR));
}
}
