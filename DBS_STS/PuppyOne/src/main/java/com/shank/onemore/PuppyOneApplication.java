package com.shank.onemore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PuppyOneApplication {
	
	static ApplicationContext cc = new AnnotationConfigApplicationContext();
	
	public static void main(String[] args) {
		System.out.println("Hiii Wow i wrote one spring app.");
		Three three = cc.getBean(Three.class);
		SpringApplication.run(PuppyOneApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext coto) {
		String [] beans = coto.getBeanDefinitionNames();
		for(String see:beans)
			System.out.println(see);
		return null;
	}
}
