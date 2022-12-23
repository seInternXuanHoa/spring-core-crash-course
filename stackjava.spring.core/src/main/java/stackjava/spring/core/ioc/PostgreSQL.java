package stackjava.spring.core.ioc;

public class PostgreSQL implements Database {

	public void execute() {
		System.out.println("PostgreSQL");
	}

}
