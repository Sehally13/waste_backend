package com.example.waste;
// ReportController.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// ReportController.java

@RestController
@RequestMapping("/api/reports")
public class ReportController {
    @Autowired
    private ReportRepository reportRepository;

    @GetMapping
    public List<Report> getAllReports() {
        return reportRepository.findAll();
    }

    @PostMapping
    public Report createReport(@RequestBody Report report) {
        return reportRepository.save(report);
    }

    @DeleteMapping("/{id}")
    public void deleteReport(@PathVariable Long id) {
        reportRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public Report updateReport(@PathVariable Long id, @RequestBody Report updatedReport) {
        // Fetch the existing report by ID
        Report existingReport = reportRepository.findById(id)
                .orElseThrow();

        // Update fields if provided in the request
        if (updatedReport.getMoneyCollected() != null) {
            existingReport.setMoneyCollected(updatedReport.getMoneyCollected());
        }
        if (updatedReport.getWasteCollected() != null) {
            existingReport.setWasteCollected(updatedReport.getWasteCollected());
        }
        if (updatedReport.getReportDate() != null) {
            existingReport.setReportDate(updatedReport.getReportDate());
        }

        // Save updated report
        return reportRepository.save(existingReport);
    }
}
