package shopping.shopping.dto;

import lombok.Data;

@Data
public class OrderResponse {
    private String orderTakingNumber;
    private String status;
    private String message;
}
