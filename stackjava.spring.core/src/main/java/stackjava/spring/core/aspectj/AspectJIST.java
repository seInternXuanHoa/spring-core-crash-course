package stackjava.spring.core.aspectj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AspectJIST {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		SystemCTL systemctl = (SystemCTL) context.getBean("systemctl-aspectj");

		systemctl.whoAmI();
	}
}
