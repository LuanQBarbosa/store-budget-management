package br.com.alura.store.order;

import java.time.LocalDateTime;

import br.com.alura.store.budget.Budget;

public class Order {
    
    private String client;
    private LocalDateTime date;
    private Budget budget;

    public Order(String client, LocalDateTime date, Budget budget) {
        this.client = client;
        this.date = date;
        this.budget = budget;
    }

    public String getClient() {
        return client;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public Budget getBudget() {
        return budget;
    }
    
}
