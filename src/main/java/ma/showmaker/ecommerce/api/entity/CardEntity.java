package ma.showmaker.ecommerce.api.entity;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "card")
public class CardEntity {

    @Id
    @GeneratedValue
    @Column(name = "ID", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "NUMBER")
    private String number;

    @Column(name = "EXPIRES")
    private String expires;

    @Column(name = "CVV")
    private String cvv;

}
