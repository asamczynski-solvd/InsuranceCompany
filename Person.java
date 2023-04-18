import java.time.LocalDate;
import java.util.Objects;
import java.util.Date;

public class Person {
    private Name name;
    private String phoneNumber;
    private String emailAddress;
    private Address address;

    private Date birthday;


    public Person(Name name, String phoneNumber, String emailAddress, Address address, Date birthday) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.address = address;
        this.birthday = birthday;
    }

    public Person() {
    }

    public Name getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public Address getAddress() {
        return address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(phoneNumber, person.phoneNumber) && Objects.equals(emailAddress, person.emailAddress) && Objects.equals(address, person.address) && Objects.equals(birthday, person.birthday);
    }

    @Override
    public String toString() {
        return ("Name: " + name +
                "\nPhone Number: " + phoneNumber +
                "\nEmail Address: " + emailAddress +
                "\nAddress: " + address +
                "\nBirthday: " + birthday.toString());
    }
}
