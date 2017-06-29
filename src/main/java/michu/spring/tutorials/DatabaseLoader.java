package michu.spring.tutorials;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import michu.spring.tutorials.model.Employee;
import michu.spring.tutorials.model.EmployeeRepository;

@Component
public class DatabaseLoader implements CommandLineRunner{

	private final EmployeeRepository repository;
	
	@Autowired
	public DatabaseLoader(EmployeeRepository repository) {
		super();
		this.repository = repository;
	}
	
	
	@Override
	public void run(String... strings) throws Exception {
		
		this.repository.save(new Employee("Frodo", "Baggins", "Ring bearer"));
	}

	

}
