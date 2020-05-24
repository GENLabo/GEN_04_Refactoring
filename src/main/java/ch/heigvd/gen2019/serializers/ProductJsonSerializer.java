package ch.heigvd.gen2019.serializers;

import ch.heigvd.gen2019.Product;
import ch.heigvd.gen2019.Size;

/**
 * JSON serializer for Product object
 */
public class ProductJsonSerializer extends ProductSerializer {

    /**
     * Parses a given Product to JSON String format
     * @param product Product to parse
     * @return JSON formatted String
     */
    public String toParse(Product product){
        StringBuffer sb = new StringBuffer();
        sb.append("{");
        sb.append("\"code\": \"");
        sb.append(product.getCode());
        sb.append("\", ");
        sb.append("\"color\": \"");
        sb.append(product.getColor());
        sb.append("\", ");

        if (product.getSize() != Size.NO_SIZE) {
            sb.append("\"size\": \"");
            sb.append(product.getSize());
            sb.append("\", ");
        }

        sb.append("\"price\": ");
        sb.append(product.getPrice());
        sb.append(", ");
        sb.append("\"currency\": \"");
        sb.append(product.getCurrency());
        sb.append("\"}, ");

        return sb.toString();
    }
}
