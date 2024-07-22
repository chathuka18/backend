package com.ceyline.group.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "mercantile_marine")
public class MCM {
    @Id
    private String id;
    @Column(nullable = false)
    private String crew_on_board;
    private String new_principals;
    @Column(nullable = false)
    private String income;
    @Column(nullable = false)
    private String cost;
    @Column(nullable = false)
    private LocalDate date;

    public MCM() {
    }

    public MCM(String id, String crew_on_board, String new_principals, String income, String cost, LocalDate date) {
        this.id = id;
        this.crew_on_board = crew_on_board;
        this.new_principals = new_principals;
        this.income = income;
        this.cost = cost;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCrew_on_board() {
        return crew_on_board;
    }

    public void setCrew_on_board(String crew_on_board) {
        this.crew_on_board = crew_on_board;
    }

    public String getNew_principals() {
        return new_principals;
    }

    public void setNew_principals(String new_principals) {
        this.new_principals = new_principals;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
