package shopping.shopping.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "orders")

public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String orderTakingNumber;
    @Column(nullable = false)
    private Integer totalQuantity;
    @Column(nullable = false)
    private BigDecimal totalPrice;
    @Column(nullable = false)

    private String status;
   @CreationTimestamp
    private LocalDateTime dateTime;
    @UpdateTimestamp
    private LocalDateTime lastUpdated;
    @Column(nullable = false)

    private Long shoppingCartId;

}
