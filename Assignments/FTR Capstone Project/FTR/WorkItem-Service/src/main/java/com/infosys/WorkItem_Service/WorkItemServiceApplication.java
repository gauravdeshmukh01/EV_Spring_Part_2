package com.infosys.WorkItem_Service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class WorkItemServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkItemServiceApplication.class, args);
	}

}
