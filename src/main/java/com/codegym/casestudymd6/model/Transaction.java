package com.codegym.casestudymd6.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "transactions")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String amount;

    private String note;

    private Date date;

    @ManyToOne
    private Category category;

    public Transaction() {
    }

    public Transaction(long id, String amount, String note, Date date, Category category) {
        this.id = id;
        this.amount = amount;
        this.note = note;
        this.date = date;
        this.category = category;
    }

    public Transaction(String amount, String note, Date date, Category category) {
        this.amount = amount;
        this.note = note;
        this.date = date;
        this.category = category;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
