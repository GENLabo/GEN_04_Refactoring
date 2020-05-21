package ch.heigvd.gen2019;

import ch.heigvd.gen2019.serializers.ProductSerializer;

public class ProductWriter {
    private Product product;
    private ProductSerializer productSerializer;

    public ProductWriter(Product product, ProductSerializer serializer) {
        this.product = product;
        this.productSerializer = serializer;
    }

    public String getContents() {
        return productSerializer.toParse(product);
    }

}
