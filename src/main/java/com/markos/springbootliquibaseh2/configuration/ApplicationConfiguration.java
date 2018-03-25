package com.markos.springbootliquibaseh2.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan("com.markos.springbootliquibaseh2.entity")
@EnableJpaRepositories({"com.markos.springbootliquibaseh2.repository"})
public class ApplicationConfiguration {

}
