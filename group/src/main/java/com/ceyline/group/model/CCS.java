package com.ceyline.group.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;
@Entity
@Table(name = "cey_container")
public class CCS {
    @Id
    private String id;
    @Column(nullable = false)
    private String gate_movement;
    private String storage_laden;
    @Column(nullable = false)
    private String storage_empty;
    @Column(nullable = false)
    private String refer_container;
    @Column(nullable = false)
    private String repairs_usd;
    @Column(nullable = false)
    private LocalDate date;

    public CCS() {
    }

    public CCS(String id, String gate_movement, String storage_laden, String storage_empty, String refer_container, String repairs_usd, LocalDate date) {
        this.id = id;
        this.gate_movement = gate_movement;
        this.storage_laden = storage_laden;
        this.storage_empty = storage_empty;
        this.refer_container = refer_container;
        this.repairs_usd = repairs_usd;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGate_movement() {
        return gate_movement;
    }

    public void setGate_movement(String gate_movement) {
        this.gate_movement = gate_movement;
    }

    public String getStorage_laden() {
        return storage_laden;
    }

    public void setStorage_laden(String storage_laden) {
        this.storage_laden = storage_laden;
    }

    public String getStorage_empty() {
        return storage_empty;
    }

    public void setStorage_empty(String storage_empty) {
        this.storage_empty = storage_empty;
    }

    public String getRefer_container() {
        return refer_container;
    }

    public void setRefer_container(String refer_container) {
        this.refer_container = refer_container;
    }

    public String getRepairs_usd() {
        return repairs_usd;
    }

    public void setRepairs_usd(String repairs_usd) {
        this.repairs_usd = repairs_usd;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
