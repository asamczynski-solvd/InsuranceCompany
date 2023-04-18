import java.util.Objects;

public class Customer {
    private String customerID;

    public Customer(String customerID) {
        this.customerID = customerID;
    }

    public Customer() {

    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(customerID, customer.customerID);
    }

    @Override
    public String toString() {
        return customerID;
    }
}
