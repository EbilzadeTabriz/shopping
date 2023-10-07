package shopping.shopping.manager;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import shopping.shopping.dto.OrderRequest;
import shopping.shopping.dto.OrderResponse;
import shopping.shopping.entity.Order;
import shopping.shopping.entity.Payment;
import shopping.shopping.exception.PaymentException;
import shopping.shopping.repository.OrderRepository;
import shopping.shopping.repository.PaymentRepository;
import shopping.shopping.service.OrderService;

import java.util.UUID;

@Service
@AllArgsConstructor
public class OrderManager implements OrderService {
    private final OrderRepository orderRepository;
    private final PaymentRepository paymentRepository;
    @Override
    @Transactional
    public OrderResponse placeOrder(OrderRequest orderRequest) {
        Order order = orderRequest.getOrder();
        order.setStatus("IN PROGRESS");
        order.setOrderTakingNumber(UUID.randomUUID().toString()); //Random number is given
        orderRepository.save(order);

        Payment payment = orderRequest.getPayment();

        if (!payment.getType().equals("DEBIT")){
            throw new PaymentException("Payment cart type do not support!");

        }
        payment.setOrderId(order.getId());
        paymentRepository.save(payment);

        OrderResponse orderResponse = new OrderResponse();
        orderResponse.setOrderTakingNumber(order.getOrderTakingNumber());
        orderResponse.setStatus(order.getStatus());
        orderResponse.setMessage("SUCCESS");
        return orderResponse   ;
    }
}
