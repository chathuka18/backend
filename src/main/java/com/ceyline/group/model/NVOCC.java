package com.ceyline.group.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "cal_nvocc")
public class NVOCC {
    @Id
    private String id;
    @Column(nullable = false)
    private String loading;
    private String discharging;
    @Column(nullable = false)
    private String transhipment;
    @Column(nullable = false)
    private String liner;
    @Column(nullable = false)
    private String export;
    @Column(nullable = false)
    private LocalDate date;

    public NVOCC() {
    }

    public NVOCC(String id, String loading, String discharging, String transhipment, String liner, String export, LocalDate date) {
        this.id = id;
        this.loading = loading;
        this.discharging = discharging;
        this.transhipment = transhipment;
        this.liner = liner;
        this.export = export;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLoading() {
        return loading;
    }

    public void setLoading(String loading) {
        this.loading = loading;
    }

    public String getDischarging() {
        return discharging;
    }

    public void setDischarging(String discharging) {
        this.discharging = discharging;
    }

    public String getTranshipment() {
        return transhipment;
    }

    public void setTranshipment(String transhipment) {
        this.transhipment = transhipment;
    }

    public String getLiner() {
        return liner;
    }

    public void setLiner(String liner) {
        this.liner = liner;
    }

    public String getExport() {
        return export;
    }

    public void setExport(String export) {
        this.export = export;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }


}