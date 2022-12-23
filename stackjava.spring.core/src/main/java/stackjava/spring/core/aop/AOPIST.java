package stackjava.spring.core.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPIST {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		SystemCTL systemctl = (SystemCTL) context.getBean("systemctlProxy");

		systemctl.whoAmI();
	}
}
