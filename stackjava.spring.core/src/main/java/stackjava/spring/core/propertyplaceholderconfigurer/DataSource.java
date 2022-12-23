package stackjava.spring.core.propertyplaceholderconfigurer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DataSource {
	private String driverClassName;
	private String url;
	private String username;
	private String password;
}
