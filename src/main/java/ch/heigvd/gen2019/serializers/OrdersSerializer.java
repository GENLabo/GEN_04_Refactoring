package ch.heigvd.gen2019.serializers;

import ch.heigvd.gen2019.Orders;

public abstract class OrdersSerializer {

    /**
     * Will be parsing a given Orders object into a specific format (determined by subclass nature)
     * @param orders Product to format
     * @return formatted String
     */
    public abstract String toParse(Orders orders);
}
