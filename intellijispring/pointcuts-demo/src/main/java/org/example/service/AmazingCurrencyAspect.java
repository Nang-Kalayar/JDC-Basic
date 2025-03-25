package org.example.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class AmazingCurrencyAspect {
    @Pointcut("this(org.example.service.AmazingCurrencyService)")
    public void pointcut() {}
    @Pointcut("target(org.example.service.AmazingCurrencyService)")


    @Before("thisPointcut()")
    public void beforeAdvice(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature().getDeclaringTypeName()
                + "." + joinPoint.getSignature().getName()
                + "before with" + Arrays.toString(joinPoint.getArgs()) + ",invoked.");
    }

}
