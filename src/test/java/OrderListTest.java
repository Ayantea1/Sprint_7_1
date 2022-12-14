import order.Order;
import order.OrderMethod;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.Matchers.notNullValue;

public class OrderListTest {

    private OrderMethod order = new OrderMethod();

    @Test
    public void orderListNotEmptyTest (){
        order.getOrderList()
                .assertThat()
                .statusCode(200)
                .body("orders", notNullValue());
    }
}
