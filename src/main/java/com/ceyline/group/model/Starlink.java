package com.ceyline.group.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "starlink_one")
public class Starlink {
    @Id
    private String id;
    @Column(nullable = false)
    private BigDecimal full_rigging;
    @Column(nullable = false)
    private BigDecimal polylining;
    @Column(nullable = false)
    private BigDecimal fumigation;
    @Column(nullable = false)
    private BigDecimal container_repairs;
    @Column(nullable = false)
    private BigDecimal container_spare_sales;
    @Column(nullable = false)
    private BigDecimal container_washing;
    @Column(nullable = false)
    private BigDecimal goh_bd;
    @Column(nullable = false)
    private LocalDate date;

    public Starlink() {
    }

    public Starlink(String id, BigDecimal full_rigging, BigDecimal polylining, BigDecimal fumigation, BigDecimal container_repairs, BigDecimal container_spare_sales, BigDecimal container_washing, BigDecimal goh_bd, LocalDate date) {
        this.id = id;
        this.full_rigging = full_rigging;
        this.polylining = polylining;
        this.fumigation = fumigation;
        this.container_repairs = container_repairs;
        this.container_spare_sales = container_spare_sales;
        this.container_washing = container_washing;
        this.goh_bd = goh_bd;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getFull_rigging() {
        return full_rigging;
    }

    public void setFull_rigging(BigDecimal full_rigging) {
        this.full_rigging = full_rigging;
    }

    public BigDecimal getPolylining() {
        return polylining;
    }

    public void setPolylining(BigDecimal polylining) {
        this.polylining = polylining;
    }

    public BigDecimal getFumigation() {
        return fumigation;
    }

    public void setFumigation(BigDecimal fumigation) {
        this.fumigation = fumigation;
    }

    public BigDecimal getContainer_repairs() {
        return container_repairs;
    }

    public void setContainer_repairs(BigDecimal container_repairs) {
        this.container_repairs = container_repairs;
    }

    public BigDecimal getContainer_spare_sales() {
        return container_spare_sales;
    }

    public void setContainer_spare_sales(BigDecimal container_spare_sales) {
        this.container_spare_sales = container_spare_sales;
    }

    public BigDecimal getContainer_washing() {
        return container_washing;
    }

    public void setContainer_washing(BigDecimal container_washing) {
        this.container_washing = container_washing;
    }

    public BigDecimal getGoh_bd() {
        return goh_bd;
    }

    public void setGoh_bd(BigDecimal goh_bd) {
        this.goh_bd = goh_bd;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
