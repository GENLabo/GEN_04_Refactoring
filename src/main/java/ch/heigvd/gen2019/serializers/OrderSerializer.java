package ch.heigvd.gen2019.serializers;

import ch.heigvd.gen2019.Order;

public abstract class OrderSerializer {

    /**
     * Will be parsing a given Order into a specific format (determined by subclass nature)
     * @param order Product to format
     * @return formatted String
     */
    public abstract String toParse(Order order);
}
