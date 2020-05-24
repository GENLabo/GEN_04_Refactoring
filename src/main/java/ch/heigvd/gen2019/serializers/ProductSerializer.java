package ch.heigvd.gen2019.serializers;

import ch.heigvd.gen2019.Product;

public abstract class ProductSerializer {
    /**
     * Will be parsing a given Product into a specific format (determined by subclass nature)
     * @param product Product to format
     * @return formatted String
     */
    public abstract String toParse(Product product);
}
