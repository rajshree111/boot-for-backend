package com.cots.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.cots.server.CotsServer;

@SpringBootApplication
@EntityScan({"com.cots.model"})
@ComponentScan({"com.cots.controller","com.cots.dao"})
@EnableJpaRepositories("com.cots.repository")
public class SpringBootDbApplication {


	public static void main(String[] args) {
		//Thread t=new Thread(new CotsServer());
		//t.start();
		
		SpringApplication.run(SpringBootDbApplication.class, args);
	}

}
