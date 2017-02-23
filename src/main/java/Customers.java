package main.java;

import java.util.List;

/**
 * Created by kevinbi on 23/02/2017.
 */
public class Customers {

    public Customer toegevoegdeCustomers(List<Customer> toegevoegdeCustomers) {
        Customer customer = new Customer();

        for (Customer aCustomer:toegevoegdeCustomers) {
            Customer.addCustomer(aCustomer);

        }



        return customer ;
    }
}
