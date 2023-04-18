import java.util.Date;
import java.util.Objects;

public class Service {
    private Person person;
    private Date serviceStartDate;
    private Date serviceEndDate;

    public Service(Person person, Date serviceStartDate, Date serviceEndDate) {
        this.person = person;
        this.serviceStartDate = serviceStartDate;
        this.serviceEndDate = serviceEndDate;
    }

    public Service() {

    }

    public Person getPerson() {
        return person;
    }

    public Date getServiceStartDate() {
        return serviceStartDate;
    }

    public Date getServiceEndDate() {
        return serviceEndDate;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setServiceStartDate(Date serviceStartDate) {
        this.serviceStartDate = serviceStartDate;
    }

    public void setServiceEndDate(Date serviceEndDate) {
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
