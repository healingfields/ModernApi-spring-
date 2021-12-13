package ma.showmaker.ecommerce.api.entity;

import ma.showmaker.ecommerce.api.model.Order;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Table(name = "orders")
public class OrderEntity {

    @Id
    @GeneratedValue
    @Column(name = "ID", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "TOTAL")
    private BigDecimal total;

    @Column(name = "STATUS")
    @Enumerated(EnumType.STRING)
    private Order.StatusEnum status;

    @Column(name = "ORDER_DATE")
    private Timestamp orderDate;


}
