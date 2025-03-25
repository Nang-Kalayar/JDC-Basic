package org.example.aspect;
@Aspect
@Component
public class PerformanceLoggerAspect {
    @PerformanceLogger
    @Around("@annotation(org.example.annotation.PerformanceLogger)")
    public  Object logger (ProceedingJoinPoint joinPoint)
            throws  Throwable{
        try{
            long start = System.currentTimeMillis();
            return joinPoint.proceed();
        }
        finally {
            long end = System.currentTimeMillis();
            System.out.println("%s method took %s ms."),
            joinPoint.getSingature().getName(),(end-start)));
        }
    }

}
