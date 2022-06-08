package com.codegym.casestudymd6.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "wallets")
public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private double amount;

    private Date date;

    private String note;

    @ManyToOne
    private Currency currency;

    @ManyToOne
    private User user;

    public Wallet() {
    }

    public Wallet(long id, String name, double amount, Date date, String note, Currency currency, User user) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.date = date;
        this.note = note;
        this.currency = currency;
        this.user = user;
    }

    public Wallet(String name, double amount, Date date, String note, Currency currency, User user) {
        this.name = name;
        this.amount = amount;
        this.date = date;
        this.note = note;
        this.currency = currency;
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
