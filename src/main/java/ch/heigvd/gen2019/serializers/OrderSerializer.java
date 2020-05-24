package ch.heigvd.gen2019.serializers;

import ch.heigvd.gen2019.Order;

public abstract class OrderSerializer {
    public abstract String toParse(Order order);
}
