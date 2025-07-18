package com.infosys.megamart_API.Gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MegamartApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MegamartApiGatewayApplication.class, args);
	}

}
