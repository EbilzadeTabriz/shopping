package shopping.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shopping.shopping.entity.Order;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
