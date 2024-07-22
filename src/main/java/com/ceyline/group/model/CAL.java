package com.ceyline.group.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "cal_agency")
public class CAL {
    @Id
    private String id;
    @Column(nullable = false)
    private String crew_change;
    @Column(nullable = false)
    private String casual_caller_ops;
    @Column(nullable = false)
    private LocalDate date;

    public CAL() {
    }

    public CAL(String id, String crew_change, String casual_caller_ops, LocalDate date) {
        this.id = id;
        this.crew_change = crew_change;
        this.casual_caller_ops = casual_caller_ops;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCrew_change() {
        return crew_change;
    }

    public void setCrew_change(String crew_change) {
        this.crew_change = crew_change;
    }

    public String getCasual_caller_ops() {
        return casual_caller_ops;
    }

    public void setCasual_caller_ops(String casual_caller_ops) {
        this.casual_caller_ops = casual_caller_ops;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}

