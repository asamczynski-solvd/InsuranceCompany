import java.time.LocalDate;
import java.util.Objects;

public class Service {
    private Person person;
    private LocalDate serviceStartDate;
    private LocalDate serviceEndDate;

    public Service(Person person, LocalDate serviceStartDate, LocalDate serviceEndDate) {
        this.person = person;
        this.serviceStartDate = serviceStartDate;
        this.serviceEndDate = serviceEndDate;
    }

    public Service() {

    }

    public Person getPerson() {
        return person;
    }

    public LocalDate getServiceStartDate() {
        return serviceStartDate;
    }

    public LocalDate getServiceEndDate() {
        return serviceEndDate;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setServiceStartDate(LocalDate serviceStartDate) {
        this.serviceStartDate = serviceStartDate;
    }

    public void setServiceEndDate(LocalDate serviceEndDate) {
        this.serviceEndDate = serviceEndDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Service service = (Service) o;
        return Objects.equals(person, service.person) && Objects.equals(serviceStartDate, service.serviceStartDate) && Objects.equals(serviceEndDate, service.serviceEndDate);
    }

    @Override
    public String toString() {
        return ("person=: " + person +
                "\nserviceStartDate: " + serviceStartDate +
                "\nserviceEndDate: " + serviceEndDate);
    }
}
