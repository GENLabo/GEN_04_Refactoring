package ch.heigvd.gen2019;

import ch.heigvd.gen2019.serializers.OrdersSerializer;

public class OrdersWriter implements Contentable {
    private Orders orders;
    private OrdersSerializer ordersSerializer;

    public OrdersWriter(Orders orders, OrdersSerializer ordersSerializer) {
        this.orders = orders;
        this.ordersSerializer = ordersSerializer;
    }
    
    @Override
    public String getContents() {
        return ordersSerializer.toParse(orders);
    }
}