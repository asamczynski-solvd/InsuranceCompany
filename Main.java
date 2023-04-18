import java.util.Date;



public class Main {
    public static void main(String[] args){
        Name name1 = new Name("Ashle", "Samczynski");
        Address address1 = new Address("123 Grove St.", "Fulton", "MD", "12345", "USA");
        Date birthday1 = new Date(1960, 10, 15);
        Person person1 = new Person(name1, "1234567890", "probllamaSolver@solvd.com", address1, birthday1);
        Customer customer1 = new Customer("000567123");
        Employee employee1 = new Employee(70000,"100567123");
        Date serviceStart = new Date(2023, 4, 18 );
        Date serviceEnd = new Date(2024, 4, 18 );
        Service service1 = new Service(person1, serviceStart, serviceEnd);
        Auto auto1 = new Auto(800.00f, 100000, 50000, 50000, 100000, 1200.00f);
        Health health1 = new Health(3600.00f, 1000f, 50, 10, 0.10f);
        Claim autoClaim1 = new Claim(auto1, true);
        Insurance insurance1 = new Insurance("200567123","089123" , false);
        Invoice invoicePerson1 = new Invoice(new Date(2023, 4, 18), 37.65, new Date(2023, 3, 5));

    }
}
