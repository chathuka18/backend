package com.ceyline.group.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "cml_ships")
public class CML {
    @Id
    private String id;
    @Column(nullable = false)
    private String ship_boat;
    private String flag_state;
    @Column(nullable = false)
    private String endorsement;
    @Column(nullable = false)
    private String oluwil;
    @Column(nullable = false)

    private LocalDate date;

    public CML() {
    }

    public CML(String id, String ship_boat, String flag_state, String endorsement, String oluwil, LocalDate date) {
        this.id = id;
        this.ship_boat = ship_boat;
        this.flag_state = flag_state;
        this.endorsement = endorsement;
        this.oluwil = oluwil;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getShip_boat() {
        return ship_boat;
    }

    public void setShip_boat(String ship_boat) {
        this.ship_boat = ship_boat;
    }

    public String getFlag_state() {
        return flag_state;
    }

    public void setFlag_state(String flag_state) {
        this.flag_state = flag_state;
    }

    public String getEndorsement() {
        return endorsement;
    }

    public void setEndorsement(String endorsement) {
        this.endorsement = endorsement;
    }

    public String getOluwil() {
        return oluwil;
    }

    public void setOluwil(String oluwil) {
        this.oluwil = oluwil;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}

