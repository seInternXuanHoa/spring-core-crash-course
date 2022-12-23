package stackjava.spring.core.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import stackjava.spring.core.ioc.User;

public class Application {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		User userCi = (User) context.getBean("user-ci");
		User userDi = (User) context.getBean("user-si");

		System.out.println("User CI: " + userCi);
		System.out.println("USer DI: " + userDi);
	}
}
