package com.ojas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class SpringMvcCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcCrudApplication.class, args);
	}

}
