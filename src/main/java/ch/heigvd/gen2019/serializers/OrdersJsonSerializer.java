package ch.heigvd.gen2019.serializers;

import ch.heigvd.gen2019.OrderWriter;
import ch.heigvd.gen2019.Orders;

/**
 * JSON serializer for Orders object
 */
public class OrdersJsonSerializer extends OrdersSerializer {

    /**
     * Parses a given Orders object to JSON String format
     * @param orders Product to parse
     * @return JSON formatted String
     */
    public String toParse(Orders orders){
        StringBuffer sb = new StringBuffer("{\"orders\": [");

        OrderJsonSerializer orderJsonSerializer = new OrderJsonSerializer();
        OrderWriter orderWriter;
        for (int i = 0; i < orders.getOrdersCount(); i++) {
            orderWriter = new OrderWriter(orders.getOrder(i), orderJsonSerializer);
            sb.append(orderWriter.getContents());
        }

        if (orders.getOrdersCount() > 0) {
            sb.delete(sb.length() - 2, sb.length());
        }

        return sb.append("]}").toString();
    }
}
