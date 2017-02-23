import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Map;
import java.util.UUID;

import static org.junit.Assert.*;

/**
 * Created by wouterba on 23/02/2017.
 */
public class CustomerTest {
    private Customer customer;

    @Before
    public void setUp(){
        customer = new Customer(new LoyaltyCard(UUID.randomUUID().toString(), 0));
    }

    @Test
    public void updateValuesInShoppingCartIfCustomerGoesShoppingTwiceADay(){
        Groceries groceries = new Groceries();
        groceries.addToShoppingCart("beer", 6);
        groceries.addToShoppingCart("candy", 1);
        groceries.addToShoppingCart("steak", 8);

        customer.addGrocery(LocalDate.now(), groceries);
        customer.addGrocery(LocalDate.now(), groceries);

        Assertions.assertThat(customer.getGroceriesHistory().get(LocalDate.now()).getShoppingCart().get("beer"))
                .isEqualTo(12);
    }
}