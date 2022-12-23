package stackjava.spring.core.propertyplaceholderconfigurer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertyPlaceholderConfigurerIST {
	public static void main(String[] args) {
		// Application Context
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		DataSource dataSource = (DataSource) context.getBean("datasource");

		System.out.println("Data Source: " + dataSource);
	}
}
