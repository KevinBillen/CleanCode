package test.java;

import main.java.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kevinbi on 23/02/2017.
 */
public class CustomersTest {

    @Test

    public void toegevoegdeCustomers() throws Exception {
        Customer customer1 = new Customer();
        Customer customer2 = new Customer();
        Customer customer3 = new Customer();
        Customer customer4 = new Customer();


        List<Customer> toegevoegdeCustomers = new ArrayList(4);
        toegevoegdeCustomers.add(customer1);
        toegevoegdeCustomers.add(customer2);
        toegevoegdeCustomers.add(customer3);
        toegevoegdeCustomers.add(customer4);

        Customer customer1 = Customers.toegevoegdeCustomers(toegevoegdeCustomers);
    }
}
