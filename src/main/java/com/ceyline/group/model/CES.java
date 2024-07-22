package com.ceyline.group.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "ceyline_engineering_services")
public class CES {
    @Id
    private String id;
    @Column(nullable = false)
    private String cdl_dry_docking;
    @Column(nullable = false)
    private String no_of_vessels;
    @Column(nullable = false)
    private String no_of_jobs;
    @Column(nullable = false)
    private LocalDate date;

    public CES() {
    }

    public CES(String id, String cdl_dry_docking, String no_of_vessels, String no_of_jobs, LocalDate date) {
        this.id = id;
        this.cdl_dry_docking = cdl_dry_docking;
        this.no_of_vessels = no_of_vessels;
        this.no_of_jobs = no_of_jobs;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCdl_dry_docking() {
        return cdl_dry_docking;
    }

    public void setCdl_dry_docking(String cdl_dry_docking) {
        this.cdl_dry_docking = cdl_dry_docking;
    }

    public String getNo_of_vessels() {
        return no_of_vessels;
    }

    public void setNo_of_vessels(String no_of_vessels) {
        this.no_of_vessels = no_of_vessels;
    }

    public String getNo_of_jobs() {
        return no_of_jobs;
    }

    public void setNo_of_jobs(String no_of_jobs) {
        this.no_of_jobs = no_of_jobs;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
