package com.template.Jenkins;

import jakarta.annotation.PostConstruct;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class JenkinsApplication {
	public static Logger LOGGER = (Logger) LoggerFactory.getLogger(JenkinsApplication.class);

	@PostConstruct
	public void init(){
		LOGGER.info("Logged in init...");
	}
	public static void main(String[] args) {

		LOGGER.info("Logged in main...");
		SpringApplication.run(JenkinsApplication.class, args);
	}

}
