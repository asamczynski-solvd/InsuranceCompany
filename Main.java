import java.util.Date;


public class Main {
    public static void main(String[] args) {
        Name name1 = new Name("Ashle", "Samczynski");
        Address address1 = new Address("123 Grove St.", "Fulton", "MD", "12345", "USA");
        Date birthday1 = new Date(1960, 10, 15);
        Name name2 = new Name("Viktor", "Samczynski");
        Date birthday2 = new Date(2015, 10, 15);
        Customer customer1 = new Customer(name2, "1234567890", "", address1, birthday2, "000567123");
        Employee employee1 = new Employee(name1, "1234567890", "probllamaSolver@solvd.com", address1, birthday1, 70000, "100567123");
        Date serviceStart = new Date(2023, 4, 18);
        AutoInsurance auto1 = new AutoInsurance(employee1, serviceStart, "G24M12", "GS2412", true, 800.00f, 100000, 50000, 50000, 100000, 1200.00f, 0.05f);
        Insurance health1 = new HealthInsurance(customer1, serviceStart, "M24M12", "MS2412", true, 3600.00f, 1000f, 50, 10, 0.10f);
        Claim autoClaim1 = new Claim(auto1);
        System.out.println("percentCovered: " + auto1.percentageCovered());
        Payment payment1 = new Payment(new Date(2023, 4, 28), 10.00);
        Invoice invoicePerson1 = new Invoice(37.65, new Date(2023, 4, 18), false, payment1);

    }
}
