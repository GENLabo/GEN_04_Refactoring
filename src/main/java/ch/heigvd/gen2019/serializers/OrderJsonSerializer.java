package ch.heigvd.gen2019.serializers;

import ch.heigvd.gen2019.Order;
import ch.heigvd.gen2019.ProductWriter;

/**
 * JSON serializer for Order object
 */
public class OrderJsonSerializer extends OrderSerializer {

    /**
     * Parses a given Order to JSON String format
     * @param order Order to parse
     * @return JSON formatted String
     */
    public String toParse(Order order){
        StringBuffer sb = new StringBuffer();
        sb.append("{");
        sb.append("\"id\": ");
        sb.append(order.getOrderId());
        sb.append(", ");
        sb.append("\"products\": [");

        ProductWriter productWriter;
        ProductJsonSerializer productJsonSerializer = new ProductJsonSerializer();
        for (int j = 0; j < order.getProductsCount(); j++) {
            productWriter = new ProductWriter(order.getProduct(j),productJsonSerializer);
            sb.append(productWriter.getContents());
        }

        if (order.getProductsCount() > 0) {
            sb.delete(sb.length() - 2, sb.length());
        }

        sb.append("]");
        sb.append("}, ");

        return sb.toString();
    }
}
