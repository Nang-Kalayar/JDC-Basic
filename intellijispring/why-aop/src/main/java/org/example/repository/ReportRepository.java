package org.example.repository;

import org.example.ds.Report;

@Repository
public class ReportRepository {

    public  void save(Report report) {
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        System.out.println("Report saved to database");

    }
}
