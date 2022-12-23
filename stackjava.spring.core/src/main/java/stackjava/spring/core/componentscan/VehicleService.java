package stackjava.spring.core.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {

	@Autowired
	VehicleRepository repository;

	public void findAll() {
		System.out.println("Find all (service)...");
		repository.findAll();
	}
}
