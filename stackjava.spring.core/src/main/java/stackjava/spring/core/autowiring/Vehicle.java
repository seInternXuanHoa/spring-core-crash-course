package stackjava.spring.core.autowiring;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Vehicle {
	private String name;
	private int speed;

	@NonNull
	private Manufacturer manufacturer;
}
