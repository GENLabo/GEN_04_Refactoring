package ch.heigvd.gen2019;

import ch.heigvd.gen2019.colors.Color;

public class Product {
    private String code;
    private Color color;
    private Size size;
    private double price;
    private String currency;

    public Product(String code, Color color, Size size, double price, String currency) {
        this.code = code;
        this.color = color;
        this.size = size;
        this.price = price;
        this.currency = currency;

    }

    /**
     * Simple code getter
     * @return the Product's code
     */
    public String getCode() {
        return code;
    }

    /**
     * Simple color getter
     * @return the Product's color
     */
    public Color getColor() {
        return color;
    }

    /**
     * Simple size getter
     * @return the Product's size
     */
    public Size getSize() {
        return size;
    }

    /**
     * Simple price getter
     * @return the Product's price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Simple currency
     * @return the Product's currency
     */
    public String getCurrency() {
        return currency;
    }

}