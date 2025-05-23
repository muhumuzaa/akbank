package com.example.akbank.Models;

import javafx.beans.property.*;

import java.time.LocalDate;

public class Transaction {
    private final StringProperty sender;
    private final StringProperty reciever;
    private final DoubleProperty amount;
    private final ObjectProperty<LocalDate> date;
    private final StringProperty message;

    public Transaction(String sender, String reciever, Double amount, LocalDate date, String message) {
        this.sender = new SimpleStringProperty(this, "sender", sender);
        this.reciever = new SimpleStringProperty(this, "reciever", reciever);
        this.amount = new SimpleDoubleProperty(this, "amount", amount);
        this.date = new SimpleObjectProperty<>(this, "date", date);
        this.message = new SimpleStringProperty(this, "message", message);
    }

    public StringProperty senderProperty() {return this.sender;}
    public StringProperty recieverProperty() {return this.reciever;}
    public DoubleProperty amountProperty() {return this.amount;}
    public ObjectProperty<LocalDate> dateProperty() {return this.date;}
    public StringProperty messageProperty() {return this.message;}

}
