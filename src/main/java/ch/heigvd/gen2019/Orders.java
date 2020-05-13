package ch.heigvd.gen2019;

import java.util.ArrayList;
import java.util.List;

public class Orders {
    private List<Order> orders = new ArrayList<Order>();

    public void AddOrder(Order order) {
        orders.add(order);
    }

    public int getOrdersCount() {
        return orders.size();
    }

    public Order getOrder(int i) {
        return orders.get(i);
    }

    @Override
    public String toString() {
        String res = "{\"orders\": [";
        for (int i = 0; i < getOrdersCount(); i++) {
            res += getOrder(i);
        }

        if (getOrdersCount() > 0) {
            res = res.substring(0, res.length()-2);
        }

        res += "]}";

        return res;
    }
}
