package stackjava.spring.core.componentscan;

import org.springframework.stereotype.Repository;

@Repository
public class VehicleRepository {
	public void findAll() {
		System.out.println("Find all (repository)...");
	}
}
