package ch.heigvd.gen2019;

import ch.heigvd.gen2019.colors.Blue;
import ch.heigvd.gen2019.colors.Color;
import ch.heigvd.gen2019.colors.Red;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class OrdersWriterTest {
    Orders orders = new Orders();
    Order order111 = new Order(111);
    Color blue = new Blue();
    Color red = new Red();

    @BeforeEach
    public void SetupOneOrder() {
        orders.AddOrder(order111);
    }

    @Test
    public void NoOrder() {
        assertEquals("{\"orders\": []}", new Orders().toString());
    }

    @Test
    public void OneOrder() {
        String order111 = "{\"id\": 111, \"products\": []}";
        System.out.println(orders);
        assertEquals("{\"orders\": [" + order111 + "]}", orders.toString());
    }

    @Test
    public void TwoOrders() {
        orders.AddOrder(new Order(222));

        String order111Json = JsonOrder111WithProduct("");
        String order222Json = "{\"id\": 222, \"products\": []}";
        assertEquals("{\"orders\": [" + order111Json + ", " + order222Json + "]}", orders.toString());
    }

    @Test
    public void OneOrderWithOneProduct() {
        order111.AddProduct(new Product("Shirt", blue, Size.M, 2.99, "TWD"));

        String order111Json = JsonOrder111WithProduct("{\"code\": \"Shirt\", \"color\": \"blue\", \"size\": \"M\", \"price\": 2.99, \"currency\": \"TWD\"}");
        assertEquals("{\"orders\": [" + order111Json + "]}", orders.toString());
    }

    @Test
    public void OneOrderWithOneProductNoSize() {
        order111.AddProduct(new Product("Pot", red, Size.NO_SIZE, 16.50, "SGD"));

        String order111Json = JsonOrder111WithProduct("{\"code\": \"Pot\", \"color\": \"red\", \"price\": 16.5, \"currency\": \"SGD\"}");
        assertEquals("{\"orders\": [" + order111Json + "]}", orders.toString());
    }

    private String JsonOrder111WithProduct(String productJson) {
        return "{\"id\": 111, \"products\": [" + productJson + "]}";
    }
}
