package org.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class CurrencyServiceAspect {

    @Pointcut("this(org.example.service.CurrencyServiceImpl)")
    public void thisCurrencyPointcut() {

    }

    @Pointcut("target(org.example.service.CurrencyServiceImpl)")
    public void targetCurrencyPointcut() {

    }

    @Before("targetCurrencyPointcut()")
    public void beforeAdvice(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature().getDeclaringTypeName()
                + "." + joinPoint.getSignature().getName()
                + "before with" + Arrays.toString(joinPoint.getArgs()) + ",invoked.");
    }
}