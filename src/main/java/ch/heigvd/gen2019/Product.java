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

    public String getCode() {
        return code;
    }

    public Color getColor() {
        return color;
    }

    public Size getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public String getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        String res = "";

        res += "{";
        res += "\"code\": \"";
        res += getCode();
        res += "\", ";
        res += "\"color\": \"";
        res += color;
        res += "\", ";

        if (getSize() != Size.NO_SIZE) {
            res += "\"size\": \"";
            res += size;
            res += "\", ";
        }

        res += "\"price\": ";
        res += getPrice();
        res += ", ";
        res += "\"currency\": \"";
        res += getCurrency();
        res += "\"}, ";

        return res;
    }
}