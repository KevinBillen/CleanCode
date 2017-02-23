package main.java;

/**
 * Created by kevinbi on 23/02/2017.
 */
public class Customer {

    private String name;
    private String barcode;

    public Customer() {
        this.name = null;
        this.barcode = null;
    }

    public Customer(String name, String barcode) {
        this.name = name;
        this.barcode = barcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (name != null ? !name.equals(customer.name) : customer.name != null) return false;
        return barcode != null ? barcode.equals(customer.barcode) : customer.barcode == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (barcode != null ? barcode.hashCode() : 0);
        return result;
    }

    public static void addCustomer(Customer aCustomer) {
    }
}
