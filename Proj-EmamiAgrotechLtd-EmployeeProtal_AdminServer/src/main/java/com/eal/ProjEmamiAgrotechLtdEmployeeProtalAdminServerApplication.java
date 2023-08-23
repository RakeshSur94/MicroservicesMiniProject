package com.eal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class ProjEmamiAgrotechLtdEmployeeProtalAdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjEmamiAgrotechLtdEmployeeProtalAdminServerApplication.class, args);
	}

}
