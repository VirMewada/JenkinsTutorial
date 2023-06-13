package com.template.Jenkins;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.logging.Logger;

@SpringBootTest
class JenkinsApplicationTests {

	public Logger LOGGER = (Logger) LoggerFactory.getLogger(JenkinsApplicationTests.class);
	@Test
	void contextLoads() {
		LOGGER.info("Logged in test...");
	}

}
