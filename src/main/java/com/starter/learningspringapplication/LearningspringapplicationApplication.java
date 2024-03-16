package com.starter.learningspringapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class LearningspringapplicationApplication {

	public static void main(String[] args) {
		//ApplicationContext applicationContext = SpringApplication.run(LearningspringapplicationApplication.class, args);
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(LearningspringapplicationApplication.class);

		for (String beanName: applicationContext.getBeanDefinitionNames())
			System.out.println(beanName);

		System.out.println("My First Spring Appln ....");


	}

}
