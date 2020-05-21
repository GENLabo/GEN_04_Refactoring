package ch.heigvd.gen2019.serializers;

import ch.heigvd.gen2019.Product;

public abstract class ProductSerializer {
    public abstract String toParse(Product product);
}
