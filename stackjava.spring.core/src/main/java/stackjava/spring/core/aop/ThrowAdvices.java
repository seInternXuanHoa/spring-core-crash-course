package stackjava.spring.core.aop;

import org.springframework.aop.ThrowsAdvice;

public class ThrowAdvices implements ThrowsAdvice {

	public void afterThrowing(IllegalArgumentException e) throws Throwable {
		System.out.println("Throw advice method: ");
	}
}
