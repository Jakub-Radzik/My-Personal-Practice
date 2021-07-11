package com.example.demo.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class LoggingAspect {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @AfterReturning(pointcut = "execution(* com.example.demo..*.*(..))", returning = "result")
    public void LogAfterExecution(JoinPoint joinPoint, Object result) {
        logger.info("Method {} complete -> {} ", joinPoint, result);
    }

    @AfterThrowing(value = "execution(* com.example.demo..*.*(..))", throwing = "exception")
    public void logAfterException(JoinPoint joinPoint, Object exception) {
        logger.info("Exception in {} returned with: {}", joinPoint, exception);
    }

    @After("execution(* com.example.demo..*.*(..))")
    public void logAfterMethod(JoinPoint joinPoint){
        logger.info("After method call {}", joinPoint);
    }

    @Before("com.example.demo.Aspect.JoinPointConfig.businessLayerPointcut()")
    public void beforeBusiness(JoinPoint joinPoint){
        logger.info("EEEEOOOO {}", joinPoint);
    }
}
