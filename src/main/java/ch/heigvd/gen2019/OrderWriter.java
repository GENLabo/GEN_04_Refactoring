package ch.heigvd.gen2019;

import ch.heigvd.gen2019.serializers.OrderSerializer;

public class OrderWriter implements Contentable{
    private Order order;
    private OrderSerializer orderSerializer; // Serializer that will be used

    public OrderWriter(Order order, OrderSerializer orderSerializer) {
        this.order = order;
        this.orderSerializer = orderSerializer;
    }

    @Override
    public String getContents() {
        return orderSerializer.toParse(order);
    }
}
