package ch.heigvd.gen2019;

import ch.heigvd.gen2019.serializers.ProductSerializer;

public class ProductWriter implements Contentable{
    private Product product;
    private ProductSerializer productSerializer; // Serializer that will be used

    public ProductWriter(Product product, ProductSerializer serializer) {
        this.product = product;
        this.productSerializer = serializer;
    }

    @Override
    public String getContents() {
        return productSerializer.toParse(product);
    }

}
