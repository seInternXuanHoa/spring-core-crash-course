package stackjava.spring.core.ioc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DBManager {
	private Database database;

	public void execute() {
		database.execute();
	}
}
