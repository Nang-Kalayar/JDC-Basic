package org.example.action;

import org.example.ReportProvider;
import org.example.ds.Report;
import org.example.formatter.ReportFormatter;
import org.example.logger.PerformancLogger;
import org.example.repository.ReportRepository;

;
@Service
public class ComplexAction {

    private ReportRepository reportRepository;
    private ReportProvider reportProvider;
    private ReportFormatter reportFormatter;

    public  ComplexAction(ReportRepository reportRepository, ReportProvider reportProvider, ReportFormatter
            reportFormatter) {
        this.reportRepository = reportRepository;
        this.reportProvider = reportProvider;
        this.reportFormatter = reportFormatter;
    }
    public static void complexAction() {
        Report report = reportProvider.getReport();
        Report formattedReport =reportFormatter.formatReport(report);
        reportRepository.save(formattedReport);
    }


}

