package ch.heigvd.gen2019;

import ch.heigvd.gen2019.serializers.OrdersSerializer;

public class OrdersWriter {
    private Orders orders;
    private OrdersSerializer ordersSerializer;

    public OrdersWriter(Orders orders, OrdersSerializer ordersSerializer) {
        this.orders = orders;
        this.ordersSerializer = ordersSerializer;
    }

    public String getContents() {
        return ordersSerializer.toParse(orders);
    }
}