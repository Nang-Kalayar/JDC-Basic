package org.example.formatter;

import org.example.ds.Report;

@Component
public class ReportFormatter {
    public Report formatReport(Report report) {
        try{
            Thread.sleep(5);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        System.out.println("ReportFormatter".formatted(report));
        System.out.println(report);
    }
}
