package shopping.shopping.dto;

import lombok.Data;
import shopping.shopping.entity.Order;
import shopping.shopping.entity.Payment;

@Data
public class OrderRequest {
    private Order order;
    private Payment payment;

}
