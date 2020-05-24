package ch.heigvd.gen2019;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> products = new ArrayList<Product>();
    private int id;

    public Order(int id) {
        this.id = id;
    }

    /**
     * Simple id getter
     * @return the Order's id
     */
    public int getOrderId() {
        return id;
    }

    /**
     * Returns how many Product exist
     * @return the current number of Product
     */
    public int getProductsCount() {
        return products.size();
    }

    /**
     * Get Product from its index
     * @param j index of the Product
     * @return the Product of index j
     */
    public Product getProduct(int j) {
        return products.get(j);
    }

    /**
     * Adds one product to object's list
     * @param product the product to add
     */
    public void AddProduct(Product product) {
        products.add(product);
    }
}
