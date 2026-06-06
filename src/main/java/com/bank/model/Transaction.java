package com.bank.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction {
    private String type;
    private String description;
    private String timestamp;

    public Transaction(String type, String description) {
        this.type = type;
        this.description = description;
        this.timestamp = LocalDateTime.now()
            .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    public String getType() { return type; }
    public String getDescription() { return description; }
    public String getTimestamp() { return timestamp; }
}
