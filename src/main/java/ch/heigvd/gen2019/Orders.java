package ch.heigvd.gen2019;

import java.util.ArrayList;
import java.util.List;

public class Orders {
    private List<Order> orders = new ArrayList<Order>();

    /**
     * Adds one order to object's list
     * @param order Order to add
     */
    public void AddOrder(Order order) {
        orders.add(order);
    }

    /**
     * Returns how many Order objects are currently in the list
     * @return the current number of Order objects
     */
    public int getOrdersCount() {
        return orders.size();
    }

    /**
     * Get a specific Order by its index
     * @param i index of the Order
     * @return the Order
     */
    public Order getOrder(int i) {
        return orders.get(i);
    }
}
