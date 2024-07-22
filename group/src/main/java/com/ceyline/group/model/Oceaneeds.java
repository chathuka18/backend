package com.ceyline.group.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "oceaneeds")
public class Oceaneeds {
    @Id
    private String id;
    @Column(nullable = false)
    private BigDecimal no_of_operations;
    @Column(nullable = false)
    private BigDecimal no_of_quotations;
    @Column(nullable = false)
    private BigDecimal no_of_confirmed_jobs;
    @Column(nullable = false)
    private BigDecimal success_rate;
    @Column(nullable = false)
    private BigDecimal new_principles_tap_added;
    @Column(nullable = false)
    private LocalDate date;

    public Oceaneeds(String id, BigDecimal no_of_operations, BigDecimal no_of_quotations, BigDecimal no_of_confirmed_jobs, BigDecimal success_rate, BigDecimal new_principles_tap_added, LocalDate date) {
        this.id = id;
        this.no_of_operations = no_of_operations;
        this.no_of_quotations = no_of_quotations;
        this.no_of_confirmed_jobs = no_of_confirmed_jobs;
        this.success_rate = success_rate;
        this.new_principles_tap_added = new_principles_tap_added;
        this.date = date;
    }
    public Oceaneeds() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getNo_of_operations() {
        return no_of_operations;
    }

    public void setNo_of_operations(BigDecimal no_of_operations) {
        this.no_of_operations = no_of_operations;
    }

    public BigDecimal getNo_of_quotations() {
        return no_of_quotations;
    }

    public void setNo_of_quotations(BigDecimal no_of_quotations) {
        this.no_of_quotations = no_of_quotations;
    }

    public BigDecimal getNo_of_confirmed_jobs() {
        return no_of_confirmed_jobs;
    }

    public void setNo_of_confirmed_jobs(BigDecimal no_of_confirmed_jobs) {
        this.no_of_confirmed_jobs = no_of_confirmed_jobs;
    }

    public BigDecimal getSuccess_rate() {
        return success_rate;
    }

    public void setSuccess_rate(BigDecimal success_rate) {
        this.success_rate = success_rate;
    }

    public BigDecimal getNew_principles_tap_added() {
        return new_principles_tap_added;
    }

    public void setNew_principles_tap_added(BigDecimal new_principles_tap_added) {
        this.new_principles_tap_added = new_principles_tap_added;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
