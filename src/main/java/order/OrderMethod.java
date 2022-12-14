package order;

import Base.BaseMethod;
import Courier.Courier;
import io.restassured.response.ValidatableResponse;

public class OrderMethod extends BaseMethod {


    protected static final String ORDER_URI = API_PREFIX + "orders";

    public ValidatableResponse create(Order order){
        return spec()
                .body(order)
                .when()
                .post(ORDER_URI)
                .then().log().all();
    }
    public ValidatableResponse getOrderList (){
        return spec()
                .when()
                .get(ORDER_URI)
                .then().log().all();
    }
}
