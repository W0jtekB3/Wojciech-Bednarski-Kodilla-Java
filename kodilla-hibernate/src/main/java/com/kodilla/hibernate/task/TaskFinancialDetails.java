package com.kodilla.hibernate.task;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "TASK_FINANCIAL_DETAILS")
public class TaskFinancialDetails {
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "PRICE")
    private BigDecimal price;

    @Column(name = "PAID")
    private boolean paid;

    public TaskFinancialDetails() {
    }

    public TaskFinancialDetails(BigDecimal price, boolean paid) {
        this.price = price;
        this.paid = paid;
    }

    public int getId() {
        return id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }
}