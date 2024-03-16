package com.starter.learningspringapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestLearningspringapplicationApplication {

	public static void main(String[] args) {
		SpringApplication.from(LearningspringapplicationApplication::main).with(TestLearningspringapplicationApplication.class).run(args);
	}

}
