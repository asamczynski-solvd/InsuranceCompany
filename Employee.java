import java.util.Date;
import java.util.Objects;

public class Employee extends Person {
    private int salary;
    private String employeeID;

    public Employee(Name name, String phoneNumber, String emailAddress, Address address, Date birthday, int salary, String employeeID) {
        super(name, phoneNumber, emailAddress, address, birthday);
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && Objects.equals(employeeID, employee.employeeID);
    }

    @Override
    public String toString() {
        return (super.toString() + "\nemployeeID= " + employeeID + "\nsalary= " + salary);
    }
}
