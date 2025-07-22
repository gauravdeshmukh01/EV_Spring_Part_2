package com.infosys.FTR_EurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FtrEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FtrEurekaServerApplication.class, args);
	}

}
