package ch.heigvd.gen2019.serializers;

import ch.heigvd.gen2019.Orders;

public abstract class OrdersSerializer {
    public abstract String toParse(Orders orders);
}
