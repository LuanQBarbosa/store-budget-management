package br.com.alura.store;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import br.com.alura.store.order.GenerateOrder;
import br.com.alura.store.order.action.AfterOrderAction;
import br.com.alura.store.order.action.OrderLog;
import br.com.alura.store.order.action.SendOrderEmail;
import br.com.alura.store.order.action.StoreOrderOnDatabase;

public class OrderTests {
    
    public static void main(String[] args) {
        String client = "Luan";
        BigDecimal budgetValue = new BigDecimal("300");

        List<AfterOrderAction> actions = Arrays.asList(
            new StoreOrderOnDatabase(),
            new SendOrderEmail(),
            new OrderLog()
        );

        GenerateOrder generator = new GenerateOrder(client, budgetValue, actions);
        generator.execute();
    }
    
}
