package com.ceyline.group.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "ceyline_maritime_services")
public class CMS {
    @Id
    private String id;
    @Column(nullable = false)
    private String foreign_hires;
    private String local;
    @Column(nullable = false)
    private String caller_ops;
    @Column(nullable = false)
    private String agency_network;
    @Column(nullable = false)
    private String new_principles_tap_added;
    @Column(nullable = false)

    private LocalDate date;

    public CMS(String id, String foreign_hires, String local, String caller_ops, String agency_network, String new_principles_tap_added, LocalDate date) {
        this.id = id;
        this.foreign_hires = foreign_hires;
        this.local = local;
        this.caller_ops = caller_ops;
        this.agency_network = agency_network;
        this.new_principles_tap_added = new_principles_tap_added;
        this.date = date;
    }

    public CMS() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getForeign_hires() {
        return foreign_hires;
    }

    public void setForeign_hires(String foreign_hires) {
        this.foreign_hires = foreign_hires;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getCaller_ops() {
        return caller_ops;
    }

    public void setCaller_ops(String caller_ops) {
        this.caller_ops = caller_ops;
    }

    public String getAgency_network() {
        return agency_network;
    }

    public void setAgency_network(String agency_network) {
        this.agency_network = agency_network;
    }

    public String getNew_principles_tap_added() {
        return new_principles_tap_added;
    }

    public void setNew_principles_tap_added(String new_principles_tap_added) {
        this.new_principles_tap_added = new_principles_tap_added;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
