package org.example;
@Component
public class ReportProvider {
    public Report getReport(){
        try{
            Thread.sleep(5);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        System.out.println("Report saved to database");


    }
}
