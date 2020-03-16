package com.example.jdbc_project;

import com.example.jdbc_project.model.Employee;
import com.example.jdbc_project.repository.EmployeeJDBCRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JdbcProjectApplication implements CommandLineRunner {
	@Override
	public void run(String... args) throws Exception {

	}

	public static void main(String[] args) {
		SpringApplication.run(JdbcProjectApplication.class, args);
	}
}