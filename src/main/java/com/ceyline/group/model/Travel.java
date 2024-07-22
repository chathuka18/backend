package com.ceyline.group.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "ceyline_travels")
public class Travel {
    @Id
    private String id;
    @Column(nullable = false)
    private BigDecimal Tickets_Seafarer;
    @Column(nullable = false)
    private BigDecimal Tickets_FIT_Corporate;
    @Column(nullable = false)
    private BigDecimal Outbound;
    @Column(nullable = false)
    private BigDecimal Inbound;
    @Column(nullable = false)
    private BigDecimal Visa;
    @Column(nullable = false)
    private BigDecimal Insurance;
    @Column(nullable = false)
    private LocalDate date;

    public Travel(String id, BigDecimal tickets_Seafarer, BigDecimal tickets_FIT_Corporate, BigDecimal outbound, BigDecimal inbound, BigDecimal visa, BigDecimal insurance, LocalDate date) {
        this.id = id;
        Tickets_Seafarer = tickets_Seafarer;
        Tickets_FIT_Corporate = tickets_FIT_Corporate;
        Outbound = outbound;
        Inbound = inbound;
        Visa = visa;
        Insurance = insurance;
        this.date = date;
    }

    public Travel() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getTickets_Seafarer() {
        return Tickets_Seafarer;
    }

    public void setTickets_Seafarer(BigDecimal tickets_Seafarer) {
        Tickets_Seafarer = tickets_Seafarer;
    }

    public BigDecimal getTickets_FIT_Corporate() {
        return Tickets_FIT_Corporate;
    }

    public void setTickets_FIT_Corporate(BigDecimal tickets_FIT_Corporate) {
        Tickets_FIT_Corporate = tickets_FIT_Corporate;
    }

    public BigDecimal getOutbound() {
        return Outbound;
    }

    public void setOutbound(BigDecimal outbound) {
        Outbound = outbound;
    }

    public BigDecimal getInbound() {
        return Inbound;
    }

    public void setInbound(BigDecimal inbound) {
        Inbound = inbound;
    }

    public BigDecimal getVisa() {
        return Visa;
    }

    public void setVisa(BigDecimal visa) {
        Visa = visa;
    }

    public BigDecimal getInsurance() {
        return Insurance;
    }

    public void setInsurance(BigDecimal insurance) {
        Insurance = insurance;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
