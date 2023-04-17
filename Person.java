import java.time.LocalDate;
import java.util.Objects;

public class Person extends Name {
    private String phoneNumber;
    private String emailAddress;
    private Address address;

    private LocalDate birthday;


    public Person ( String firstName, String middleName, String lastName, String phoneNumber, String emailAddress, Address address, LocalDate birthday)  {
        super(firstName, middleName, lastName);
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.address = address;
        this.birthday = birthday;
    }

    public Person() {
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

    public LocalDate getBirthday() {
        return birthday;
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

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Person person = (Person) o;
        return Objects.equals(phoneNumber, person.phoneNumber) && Objects.equals(emailAddress, person.emailAddress) && Objects.equals(address, person.address) && Objects.equals(birthday, person.birthday);
    }

    @Override
    public String toString() {
        return (super.toString() +
                "\nPhone Number: " + phoneNumber +
                "\nEmail Address: " + emailAddress +
                "\nAddress: " + address +
                "\nBirthday: " + birthday.toString());
    }
}
