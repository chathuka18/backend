package com.ceyline.group.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "ceyline_warehouse")
public class CWS {
    @Id
    private String id;
    @Column(nullable = false)
    private BigDecimal wh01_capacity;
    @Column(nullable = false)
    private BigDecimal wh01_utilization;
    @Column(nullable = false)
    private BigDecimal wh01_utilization_percentage;
    @Column(nullable = false)
    private BigDecimal wh02_capacity;
    @Column(nullable = false)
    private BigDecimal wh02_utilization;
    @Column(nullable = false)
    private BigDecimal wh02_utilization_percentage;
    @Column(nullable = false)
    private BigDecimal value_added_services;
    @Column(nullable = false)
    private LocalDate date;

    public CWS() {
    }

    public CWS(String id, BigDecimal wh01_capacity, BigDecimal wh01_utilization, BigDecimal wh01_utilization_percentage, BigDecimal wh02_capacity, BigDecimal wh02_utilization, BigDecimal wh02_utilization_percentage, BigDecimal value_added_services, LocalDate date) {
        this.id = id;
        this.wh01_capacity = wh01_capacity;
        this.wh01_utilization = wh01_utilization;
        this.wh01_utilization_percentage = wh01_utilization_percentage;
        this.wh02_capacity = wh02_capacity;
        this.wh02_utilization = wh02_utilization;
        this.wh02_utilization_percentage = wh02_utilization_percentage;
        this.value_added_services = value_added_services;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getWh01_capacity() {
        return wh01_capacity;
    }

    public void setWh01_capacity(BigDecimal wh01_capacity) {
        this.wh01_capacity = wh01_capacity;
    }

    public BigDecimal getWh01_utilization() {
        return wh01_utilization;
    }

    public void setWh01_utilization(BigDecimal wh01_utilization) {
        this.wh01_utilization = wh01_utilization;
    }

    public BigDecimal getWh01_utilization_percentage() {
        return wh01_utilization_percentage;
    }

    public void setWh01_utilization_percentage(BigDecimal wh01_utilization_percentage) {
        this.wh01_utilization_percentage = wh01_utilization_percentage;
    }

    public BigDecimal getWh02_capacity() {
        return wh02_capacity;
    }

    public void setWh02_capacity(BigDecimal wh02_capacity) {
        this.wh02_capacity = wh02_capacity;
    }

    public BigDecimal getWh02_utilization() {
        return wh02_utilization;
    }

    public void setWh02_utilization(BigDecimal wh02_utilization) {
        this.wh02_utilization = wh02_utilization;
    }

    public BigDecimal getWh02_utilization_percentage() {
        return wh02_utilization_percentage;
    }

    public void setWh02_utilization_percentage(BigDecimal wh02_utilization_percentage) {
        this.wh02_utilization_percentage = wh02_utilization_percentage;
    }

    public BigDecimal getValue_added_services() {
        return value_added_services;
    }

    public void setValue_added_services(BigDecimal value_added_services) {
        this.value_added_services = value_added_services;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}