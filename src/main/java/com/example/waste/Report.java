package com.example.waste;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// Report.java
@Entity
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long eventId;
    private BigDecimal moneyCollected;
    private String wasteCollected;
    private Date reportDate;
    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public BigDecimal getMoneyCollected() {
        return moneyCollected;
    }

    public void setMoneyCollected(BigDecimal moneyCollected) {
        this.moneyCollected = moneyCollected;
    }

    public String getWasteCollected() {
        return wasteCollected;
    }

    public void setWasteCollected(String wasteCollected) {
        this.wasteCollected = wasteCollected;
    }

    public Date getReportDate() {
        return reportDate;
    }

    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }
}
