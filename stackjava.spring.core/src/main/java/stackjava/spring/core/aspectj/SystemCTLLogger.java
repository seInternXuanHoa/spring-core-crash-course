package stackjava.spring.core.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class SystemCTLLogger {

	@Before("execution(* stackjava.spring.core.aspectj.SystemCTL.*(..))")
	public void before(JoinPoint joinPoint) {
		System.err.println("Before Advice: " + joinPoint.getSignature().getName());
	}

	@AfterReturning("execution(* stackjava.spring.core.aspectj.SystemCTL.*(..))")
	public void afterReturning(JoinPoint joinPoint) {
		System.err.println("After Returnning: " + joinPoint.getSignature().getName());
	}

	@AfterThrowing("execution(* stackjava.spring.core.aspectj.SystemCTL.*(..))")
	public void afterThrows(JoinPoint joinPoint) {
		System.err.println("After Throws: " + joinPoint.getSignature().getName());
	}

	@Around("execution(* stackjava.spring.core.aspectj.SystemCTL.*(..))")
	public void around(JoinPoint joinPoint) {
		System.err.println("Around: " + joinPoint.getSignature().getName());
	}
}
