package com.eal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ProjEmamiAgrotechLtdEmployeeProtalEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjEmamiAgrotechLtdEmployeeProtalEurekaServerApplication.class, args);
	}

}
