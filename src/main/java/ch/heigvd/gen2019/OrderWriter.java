package ch.heigvd.gen2019;

import ch.heigvd.gen2019.serializers.OrderSerializer;

public class OrderWriter {
    private Order order;
    private OrderSerializer orderSerializer;

    public OrderWriter(Order order, OrderSerializer orderSerializer) {
        this.order = order;
        this.orderSerializer = orderSerializer;
    }

    public String getContents() {
        return orderSerializer.toParse(order);
    }
}
