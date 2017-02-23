import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

/**
 * Created by davids on 23/02/2017.
 */
public class GroceryStoreTest {

    LoyaltyCard testCard;
    GroceryStore testStore;
    Customer testCustomer;
    String barCode;
    String anotherBarCode;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Before
    public void setUp() throws Exception {
        barCode = "15156454";
        anotherBarCode = "546879546";
        testCard = new LoyaltyCard(barCode, 0);
        testStore = new GroceryStore();
        testCustomer = new Customer(testCard, "David");

    }

    @Test
    public void addNewCustomer() throws Exception {
        testStore.addNewCustomer(testCustomer);

        Assertions.assertThat(testStore.getCustomerList()).contains(testCustomer);
    }

    @Test
    public void customerListDoesNotContainNotAddedCustomers() throws Exception {
        Assertions.assertThat(testStore.getCustomerList()).doesNotContain(testCustomer);
    }

    @Test
    public void searchCustomerByBarcode() throws Exception {
        testStore.addNewCustomer(testCustomer);

        Assertions.assertThat(testStore.searchCustomerByBarcode(barCode)).isEqualTo(testCustomer);
    }

    @Test
    public void searchCustomer_ForNonExcistentBarcodeThrows() throws Exception {

        expectedException.expectMessage("Customer not found");
        expectedException.expect(Exception.class);

        testStore.addNewCustomer(testCustomer);

        Assertions.assertThat(testStore.searchCustomerByBarcode(anotherBarCode)).isEqualTo(testCustomer);
    }

}