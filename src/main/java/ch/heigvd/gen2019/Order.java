package ch.heigvd.gen2019;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> products = new ArrayList<Product>();
    private int id;

    public Order(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return id;
    }

    public int getProductsCount() {
        return products.size();
    }

    public Product getProduct(int j) {
        return products.get(j);
    }

    public void AddProduct(Product product) {
        products.add(product);
    }

    @Override
    public String toString() {
        String res = "";

        res += "{";
        res += "\"id\": ";
        res += getOrderId();
        res += ", ";
        res += "\"products\": [";
        for (int j = 0; j < getProductsCount(); j++) {
            res += getProduct(j);
        }

        if (getProductsCount() > 0) {
            res = res.substring(0, res.length()-2);
        }

        res += "]";
        res += "}, ";

        return res;
    }
}
