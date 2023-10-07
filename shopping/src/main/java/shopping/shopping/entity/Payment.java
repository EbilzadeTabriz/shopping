package shopping.shopping.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String type;
    @Column(nullable = false)

    private String cardName;
    @Column(nullable = false)

    private String cardNumber;
    @Column(nullable = false)

    private Integer expiryYear;
    @Column(nullable = false)

    private Integer expiryMonth;
    @Column(nullable = false)

    private Integer cvc;
    @Column(nullable = false)

    private Long orderId;
}
