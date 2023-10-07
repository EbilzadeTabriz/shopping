package shopping.shopping.service;

import shopping.shopping.dto.OrderRequest;
import shopping.shopping.dto.OrderResponse;
import shopping.shopping.entity.Order;

import java.util.List;

public interface OrderService {

    OrderResponse placeOrder(OrderRequest orderRequest);
}
