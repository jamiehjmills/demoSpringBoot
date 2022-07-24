package com.example.demoSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Properties;

//@SpringBootApplication
@SpringBootApplication(exclude={JpaRepositoriesAutoConfiguration.class}) //this is the key!!!!
@EntityScan(basePackages = {"com.example.demoSpringBoot.entity"})
@EnableJpaRepositories(basePackages = "com.example.demoSpringBoot.entity")
public class DemoSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringBootApplication.class, args);
	}

}
