package shopping.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shopping.shopping.entity.Payment;


public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
