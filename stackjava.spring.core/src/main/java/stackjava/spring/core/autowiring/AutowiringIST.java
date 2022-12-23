package stackjava.spring.core.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiringIST {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("autowiring.xml");

		// No
		Vehicle volvo = (Vehicle) context.getBean("vehicle");
		System.out.println("Vehicle: " + volvo);

		// By Name
		volvo = (Vehicle) context.getBean("volvo");
		System.out.println("Volvo: " + volvo);
		
		// By Type
		volvo = (Vehicle) context.getBean("volvo-type");
		System.out.println("Volvo: " + volvo);

		// By Constructor
		volvo = (Vehicle) context.getBean("volvo-constructor");
		System.out.println("Volvo: " + volvo);
	}
}
