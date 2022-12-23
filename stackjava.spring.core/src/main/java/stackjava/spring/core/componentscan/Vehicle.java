package stackjava.spring.core.componentscan;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vehicle {
	private String name;
	private int speed;

	@Autowired
	private Address address;
}
