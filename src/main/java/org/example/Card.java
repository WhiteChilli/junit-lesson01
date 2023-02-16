package org.example;

public class Card {

    double amount;
    String type;

    public Card(double amount, String type) {
        this.amount = amount;
        this.type = type + "Gold";
    }
}
