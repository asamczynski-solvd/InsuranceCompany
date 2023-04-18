import java.util.Objects;

public class Employee {
    private int salary;
    private String employeeID;

    public Employee(int salary, String employeeID) {
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public Employee() {
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
        return ("employeeID= " + employeeID + "\nsalary= " + salary);
    }
}
