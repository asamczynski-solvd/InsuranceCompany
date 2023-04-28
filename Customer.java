import java.util.Date;
import java.util.Objects;

public class Customer extends Person {
    private String customerID;

    public Customer(Name name, String phoneNumber, String emailAddress, Address address, Date birthday, String customerID) {
        super(name, phoneNumber, emailAddress, address, birthday);
        this.customerID = customerID;
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
        return super.toString() + "\ncustomerID= " + customerID;
    }
}
