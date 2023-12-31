package com.example.discoverysever;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DiscoverySeverApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoverySeverApplication.class, args);
	}

}
