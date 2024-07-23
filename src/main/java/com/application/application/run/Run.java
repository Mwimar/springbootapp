package com.application.application.run;

import java.time.LocalDateTime;

public class Run {
    private Integer id;
    private String title;
    private LocalDateTime startedOn;
    private LocalDateTime completedOn;
    private Integer miles;
    private Location location;

    //Constructor
    public Run(Integer id, String title, LocalDateTime startedOn, LocalDateTime completedOn, Integer miles, Location location){
        this.id=id;
        this.title=title;
        this.startedOn=startedOn;
        this.completedOn=completedOn;
        this.miles=miles;
        this.location=location;
    }




}
