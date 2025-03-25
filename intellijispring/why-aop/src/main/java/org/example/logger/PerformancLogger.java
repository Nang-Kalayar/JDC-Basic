package org.example.logger;

public class PerformancLogger {

    public PerformanceLoggerInfo start(String methodName){
        return new PerformanceLoggerInfo(methodName,
                System.currentTimeMillis());
    }

    public PerformanceLoggerInfo end(PerformanceLoggerInfo info){
        long startTime = System.currentTimeMillis();
        long end = System.currentTimeMillis();
        String msg = info.getMethodName() + "took" + (end - start) + "ms.";
        System.out.println(msg);
    }
    public static class PerformanceLoggerInfo(){
        private String methodName;
        private long startTime;
    }
    public PerformanceLoggerInfo(String methodName,long startTime){
        this.methodName =methodName;
        this.startTime = startTime;
    }
    public  String getMethodName(){
        return getMethodName();
    }


    public  long getStartTime(){
        return getStartTime();
    }
}
