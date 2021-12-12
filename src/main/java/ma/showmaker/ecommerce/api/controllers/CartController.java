package ma.showmaker.ecommerce.api.controllers;

import ma.showmaker.ecommerce.api.CartApi;
import ma.showmaker.ecommerce.api.model.Cart;
import ma.showmaker.ecommerce.api.model.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class CartController implements CartApi {

    private static final Logger log = (Logger) LoggerFactory.getLogger(CartController.class);

    @Override
    public ResponseEntity<List<Item>> addCartItemsByCustomerId(String customerId, Item item) {
        log.info("request for customer id: {}, item {}",customerId,item);

        return ResponseEntity.ok(Collections.EMPTY_LIST);
    }

    @Override
    public ResponseEntity<List<Cart>> getCartByCustomerId(String customerId) {
        throw  new RuntimeException("manual exception throwed");
    }


}
