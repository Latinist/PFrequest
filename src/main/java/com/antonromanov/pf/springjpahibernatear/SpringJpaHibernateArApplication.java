package com.antonromanov.pf.springjpahibernatear;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.antonromanov.pf.springjpahibernatear.repository")
@SpringBootApplication
public class SpringJpaHibernateArApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaHibernateArApplication.class, args);
	}
}
