package stackjava.spring.core.ioc;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Application {
	public static void main(String[] args) {
		MySQL mySQL = new MySQL();
		PostgreSQL postgreSQL = new PostgreSQL();
		MSSQL mssql = new MSSQL();

		// CI
		DBManager dbManager = new DBManager(mySQL);
		dbManager.execute();

		// SI
		dbManager.setDatabase(postgreSQL);
		dbManager.execute();
		dbManager.setDatabase(mssql);
		dbManager.execute();

		// Bean Factory:
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(new ClassPathResource("beans.xml"));
		User user = (User) factory.getBean("user");
		System.out.println("User: " + user);
		System.out.println("User: " + System.identityHashCode(factory.getBean("user")));
		System.out.println("User: " + System.identityHashCode(factory.getBean("user")));

		// Application Context:
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		User contextUser = (User) context.getBean("user");
		System.out.println("Application Context User: " + contextUser);
	}
}
