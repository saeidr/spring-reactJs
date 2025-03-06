package net.javaguides.springboot;

import net.javaguides.springboot.entities.Employee;
import net.javaguides.springboot.repository.EmployeeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootBackendApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringbootBackendApplication.class, args);
	}

}
