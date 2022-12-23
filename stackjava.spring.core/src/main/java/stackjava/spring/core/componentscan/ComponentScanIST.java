package stackjava.spring.core.componentscan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComponentScanIST {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("autoscan.xml");
		VehicleService vehicleService = (VehicleService) context.getBean("vehicleService");
		vehicleService.findAll();
	}
}
