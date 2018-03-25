package com.markos.springbootliquibaseh2.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.markos.springbootliquibaseh2")
public class SpringbootLiquibaseH2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootLiquibaseH2Application.class, args);
	}
}
