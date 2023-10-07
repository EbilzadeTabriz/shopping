package shopping.shopping.exception;

import java.security.PublicKey;

public class PaymentException extends RuntimeException{
    public PaymentException(String message){
        super(message);
    }
}
