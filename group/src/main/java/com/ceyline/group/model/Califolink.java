package com.ceyline.group.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "califolink")
public class Califolink {
    @Id
    private String id;
    @Column(nullable = false)
    private BigDecimal container_fleet;
    @Column(nullable = false)
    private BigDecimal container_onhire;
    @Column(nullable = false)
    private BigDecimal untilzation_container;
    @Column(nullable = false)
    private BigDecimal machine_fleet;
    @Column(nullable = false)
    private BigDecimal machine_onhire;
    @Column(nullable = false)
    private BigDecimal untilzation_machine;
    @Column(nullable = false)
    private BigDecimal transport_jobs;
    @Column(nullable = false)
    private BigDecimal no_of_km;
    @Column(nullable = false)
    private BigDecimal avg_km;
    @Column(nullable = false)
    private BigDecimal teu;
    @Column(nullable = false)
    private BigDecimal eco;
    @Column(nullable = false)
    private BigDecimal clearing;
    @Column(nullable = false)
    private BigDecimal fabrication;
    @Column(nullable = false)
    private LocalDate date;

    public Califolink() {
    }

    public Califolink(String id, BigDecimal container_fleet, BigDecimal container_onhire, BigDecimal untilzation_container, BigDecimal machine_fleet, BigDecimal machine_onhire, BigDecimal untilzation_machine, BigDecimal transport_jobs, BigDecimal no_of_km, BigDecimal avg_km, BigDecimal teu, BigDecimal eco, BigDecimal clearing, BigDecimal fabrication, LocalDate date) {
        this.id = id;
        this.container_fleet = container_fleet;
        this.container_onhire = container_onhire;
        this.untilzation_container = untilzation_container;
        this.machine_fleet = machine_fleet;
        this.machine_onhire = machine_onhire;
        this.untilzation_machine = untilzation_machine;
        this.transport_jobs = transport_jobs;
        this.no_of_km = no_of_km;
        this.avg_km = avg_km;
        this.teu = teu;
        this.eco = eco;
        this.clearing = clearing;
        this.fabrication = fabrication;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getContainer_fleet() {
        return container_fleet;
    }

    public void setContainer_fleet(BigDecimal container_fleet) {
        this.container_fleet = container_fleet;
    }

    public BigDecimal getContainer_onhire() {
        return container_onhire;
    }

    public void setContainer_onhire(BigDecimal container_onhire) {
        this.container_onhire = container_onhire;
    }

    public BigDecimal getUntilzation_container() {
        return untilzation_container;
    }

    public void setUntilzation_container(BigDecimal untilzation_container) {
        this.untilzation_container = untilzation_container;
    }

    public BigDecimal getMachine_fleet() {
        return machine_fleet;
    }

    public void setMachine_fleet(BigDecimal machine_fleet) {
        this.machine_fleet = machine_fleet;
    }

    public BigDecimal getMachine_onhire() {
        return machine_onhire;
    }

    public void setMachine_onhire(BigDecimal machine_onhire) {
        this.machine_onhire = machine_onhire;
    }

    public BigDecimal getUntilzation_machine() {
        return untilzation_machine;
    }

    public void setUntilzation_machine(BigDecimal untilzation_machine) {
        this.untilzation_machine = untilzation_machine;
    }

    public BigDecimal getTransport_jobs() {
        return transport_jobs;
    }

    public void setTransport_jobs(BigDecimal transport_jobs) {
        this.transport_jobs = transport_jobs;
    }

    public BigDecimal getNo_of_km() {
        return no_of_km;
    }

    public void setNo_of_km(BigDecimal no_of_km) {
        this.no_of_km = no_of_km;
    }

    public BigDecimal getAvg_km() {
        return avg_km;
    }

    public void setAvg_km(BigDecimal avg_km) {
        this.avg_km = avg_km;
    }

    public BigDecimal getTeu() {
        return teu;
    }

    public void setTeu(BigDecimal teu) {
        this.teu = teu;
    }

    public BigDecimal getEco() {
        return eco;
    }

    public void setEco(BigDecimal eco) {
        this.eco = eco;
    }

    public BigDecimal getClearing() {
        return clearing;
    }

    public void setClearing(BigDecimal clearing) {
        this.clearing = clearing;
    }

    public BigDecimal getFabrication() {
        return fabrication;
    }

    public void setFabrication(BigDecimal fabrication) {
        this.fabrication = fabrication;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}