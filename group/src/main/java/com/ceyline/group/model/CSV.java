package com.ceyline.group.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "cargo_server")
public class CSV {
    @Id
    private String id;
    @Column(nullable = false)
    private String sea_freight;
    @Column(nullable = false)
    private String air_freight;
    @Column(nullable = false)
    private String logistics_job;
    @Column(nullable = false)
    private LocalDate date;

    public CSV() {
    }

    public CSV(String id, String sea_freight, String air_freight, String logistics_job, LocalDate date) {
        this.id = id;
        this.sea_freight = sea_freight;
        this.air_freight = air_freight;
        this.logistics_job = logistics_job;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSea_freight() {
        return sea_freight;
    }

    public void setSea_freight(String sea_freight) {
        this.sea_freight = sea_freight;
    }

    public String getAir_freight() {
        return air_freight;
    }

    public void setAir_freight(String air_freight) {
        this.air_freight = air_freight;
    }

    public String getLogistics_job() {
        return logistics_job;
    }

    public void setLogistics_job(String logistics_job) {
        this.logistics_job = logistics_job;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
