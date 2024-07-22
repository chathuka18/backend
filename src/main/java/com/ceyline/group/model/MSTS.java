package com.ceyline.group.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "msts")
public class MSTS {
    @Id
    private String id;
    @Column(nullable = false)
    private BigDecimal pti;
    @Column(nullable = false)
    private BigDecimal monitoring_days;
    @Column(nullable = false)
    private BigDecimal fleet;
    @Column(nullable = false)
    private BigDecimal owned_rent;
    @Column(nullable = false)
    private BigDecimal on_hire;
    @Column(nullable = false)
    private BigDecimal re_work;
    @Column(nullable = false)
    private BigDecimal survey;
    @Column(nullable = false)
    private BigDecimal reefer_spare;
    @Column(nullable = false)
    private BigDecimal vessel_spare;
    @Column(nullable = false)
    private BigDecimal reefer_repairs;
    @Column(nullable = false)
    private BigDecimal exports;
    @Column(nullable = false)
    private BigDecimal maldives;
    @Column(nullable = false)
    private LocalDate date;

    public MSTS() {
    }

    public MSTS(String id, BigDecimal pti, BigDecimal monitoring_days, BigDecimal fleet, BigDecimal owned_rent, BigDecimal on_hire, BigDecimal re_work, BigDecimal survey, BigDecimal reefer_spare, BigDecimal vessel_spare, BigDecimal reefer_repairs, BigDecimal exports, BigDecimal maldives, LocalDate date) {
        this.id = id;
        this.pti = pti;
        this.monitoring_days = monitoring_days;
        this.fleet = fleet;
        this.owned_rent = owned_rent;
        this.on_hire = on_hire;
        this.re_work = re_work;
        this.survey = survey;
        this.reefer_spare = reefer_spare;
        this.vessel_spare = vessel_spare;
        this.reefer_repairs = reefer_repairs;
        this.exports = exports;
        this.maldives = maldives;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getPti() {
        return pti;
    }

    public void setPti(BigDecimal pti) {
        this.pti = pti;
    }

    public BigDecimal getMonitoring_days() {
        return monitoring_days;
    }

    public void setMonitoring_days(BigDecimal monitoring_days) {
        this.monitoring_days = monitoring_days;
    }

    public BigDecimal getFleet() {
        return fleet;
    }

    public void setFleet(BigDecimal fleet) {
        this.fleet = fleet;
    }

    public BigDecimal getOwned_rent() {
        return owned_rent;
    }

    public void setOwned_rent(BigDecimal owned_rent) {
        this.owned_rent = owned_rent;
    }

    public BigDecimal getOn_hire() {
        return on_hire;
    }

    public void setOn_hire(BigDecimal on_hire) {
        this.on_hire = on_hire;
    }

    public BigDecimal getRe_work() {
        return re_work;
    }

    public void setRe_work(BigDecimal re_work) {
        this.re_work = re_work;
    }

    public BigDecimal getSurvey() {
        return survey;
    }

    public void setSurvey(BigDecimal survey) {
        this.survey = survey;
    }

    public BigDecimal getReefer_spare() {
        return reefer_spare;
    }

    public void setReefer_spare(BigDecimal reefer_spare) {
        this.reefer_spare = reefer_spare;
    }

    public BigDecimal getVessel_spare() {
        return vessel_spare;
    }

    public void setVessel_spare(BigDecimal vessel_spare) {
        this.vessel_spare = vessel_spare;
    }

    public BigDecimal getReefer_repairs() {
        return reefer_repairs;
    }

    public void setReefer_repairs(BigDecimal reefer_repairs) {
        this.reefer_repairs = reefer_repairs;
    }

    public BigDecimal getExports() {
        return exports;
    }

    public void setExports(BigDecimal exports) {
        this.exports = exports;
    }

    public BigDecimal getMaldives() {
        return maldives;
    }

    public void setMaldives(BigDecimal maldives) {
        this.maldives = maldives;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}