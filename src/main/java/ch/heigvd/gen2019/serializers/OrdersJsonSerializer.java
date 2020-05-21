package ch.heigvd.gen2019.serializers;

import ch.heigvd.gen2019.Order;
import ch.heigvd.gen2019.OrderWriter;
import ch.heigvd.gen2019.Orders;
import ch.heigvd.gen2019.ProductWriter;

public class OrdersJsonSerializer extends OrdersSerializer {

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
