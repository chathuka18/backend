package com.ceyline.group.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "ceymed_healthcare_services")
public class Ceymed {
    @Id
    private String id;
    @Column(nullable = false)
    private String no_of_reports;
    @Column(nullable = false)
    private String no_of_chanelling_patients;
    @Column(nullable = false)
    private String no_of_cooperate_staff_medicals;
    @Column(nullable = false)
    private LocalDate date;

    public Ceymed() {
    }

    public Ceymed(String id, String no_of_reports, String no_of_chanelling_patients, String no_of_cooperate_staff_medicals, LocalDate date) {
        this.id = id;
        this.no_of_reports = no_of_reports;
        this.no_of_chanelling_patients = no_of_chanelling_patients;
        this.no_of_cooperate_staff_medicals = no_of_cooperate_staff_medicals;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNo_of_reports() {
        return no_of_reports;
    }

    public void setNo_of_reports(String no_of_reports) {
        this.no_of_reports = no_of_reports;
    }

    public String getNo_of_chanelling_patients() {
        return no_of_chanelling_patients;
    }

    public void setNo_of_chanelling_patients(String no_of_chanelling_patients) {
        this.no_of_chanelling_patients = no_of_chanelling_patients;
    }

    public String getNo_of_cooperate_staff_medicals() {
        return no_of_cooperate_staff_medicals;
    }

    public void setNo_of_cooperate_staff_medicals(String no_of_cooperate_staff_medicals) {
        this.no_of_cooperate_staff_medicals = no_of_cooperate_staff_medicals;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}


