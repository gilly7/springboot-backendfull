package net.javaguides.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.repository.EmployeeRepository;

@SpringBootApplication
public class SpringbootBackendFullApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendFullApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
//        Employee employee= new Employee();
//        
//        employee.setFirstName("Gilbert");
//        employee.setLastName("Ngeno");
//        employee.setEmailId("ngeno@gmail.com");
//        employeeRepository.save(employee);
//        
//        
//        Employee employee1= new Employee();
//        employee1.setFirstName("Gilb");
//        employee1.setLastName("Ngen");
//        employee1.setEmailId("ngen@gmail.com");
//        employeeRepository.save(employee1);
	}

}
