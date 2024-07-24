package com.application.application;

import com.application.application.run.Location;
import com.application.application.run.Run;
import lombok.extern.flogger.Flogger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.beans.BeanProperty;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@SpringBootApplication
public class Application {
	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		}
	@Bean
	CommandLineRunner runner() {
		return args -> {
			Run run = new Run(1, "first run", LocalDateTime.now(), LocalDateTime.now().plus(1, ChronoUnit.HOURS), 4, Location.OUTDOOR);
			log.info("Run " + run);

		};


	}

}
