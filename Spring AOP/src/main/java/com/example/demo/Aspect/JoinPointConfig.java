package com.example.demo.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JoinPointConfig {

    @Pointcut("execution(* com.example.demo.Repositories.*.*(..))")
    public void dataLayerPointcut(){}

    @Pointcut("execution(* com.example.demo.Services.*.*(..))")
    public void businessLayerPointcut(){}

    @AfterReturning("com.example.demo.Aspect.JoinPointConfig.dataLayerExecution()")
    public void logAfterExecution(JoinPoint joinPoint){}

    @Before("com.example.demo.Aspect.JoinPointConfig.businessLayerPointcut()")
    public void beforeBusiness(JoinPoint joinPoint){}

    @Pointcut("com.example.demo.Aspect.JoinPointConfig.dataLayerPointcut() || com.example.demo.Aspect.JoinPointConfig.businessLayerPointcut()")
    public void allLayersPointcut() {}

    @Pointcut("bean(Movie*)")
    public void movieBeanPointcut(){}

    @Pointcut("@annotation(com.example.demo.Aspect.MeasureTime)")
    public void measureTimeAnnotation(){}

}
