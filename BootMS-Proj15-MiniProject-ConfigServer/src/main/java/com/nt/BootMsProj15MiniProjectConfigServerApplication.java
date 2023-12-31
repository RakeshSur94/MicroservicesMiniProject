package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class BootMsProj15MiniProjectConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMsProj15MiniProjectConfigServerApplication.class, args);
	}

}
