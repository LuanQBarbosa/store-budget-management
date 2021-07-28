package br.com.alura.store.order;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import br.com.alura.store.budget.Budget;
import br.com.alura.store.order.action.AfterOrderAction;

public class GenerateOrder {
    
    private String client;
    private BigDecimal budgetValue;
    private int itemsQuantity;

    private List<AfterOrderAction> actions;

    public GenerateOrder(String client, BigDecimal budgetValue, int itemsQuantity, List<AfterOrderAction> actions) {
        this.client = client;
        this.budgetValue = budgetValue;
        this.itemsQuantity = itemsQuantity;

        this.actions = actions;
    }

    public void execute() {
        Budget budget = new Budget(this.budgetValue, this.itemsQuantity);
        LocalDateTime date = LocalDateTime.now();

        Order order = new Order(this.client, date, budget);

        // Possible order actions
        actions.forEach(action -> action.executeAction(order));
    }
    
}
