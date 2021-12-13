package ma.showmaker.ecommerce.api.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "cart")
public class CartEntity {

    @Id
    @GeneratedValue
    @Column(name = "ID", updatable = false, nullable = false)
    private UUID id;

//    @OneToOne(
//    @JoinColumn(name = "USER_ID", referencedColumnName = "ID")
//    private UserEntity user;

}
