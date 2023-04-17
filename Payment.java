import java.time.LocalDate;
import java.util.Objects;

public class Payment {
    private LocalDate datePaid;
    private double accountReceivable;

    public Payment(LocalDate datePaid, double accountReceivable) {
        this.datePaid = datePaid;
        this.accountReceivable = accountReceivable;
    }

    public Payment() {
    }

    public LocalDate getDatePaid() {
        return datePaid;
    }

    public double getAccountReceivable() {
        return accountReceivable;
    }

    public void setDatePaid(LocalDate datePaid) {
        this.datePaid = datePaid;
    }

    public void setAccountReceivable(double accountReceivable) {
        this.accountReceivable = accountReceivable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return accountReceivable == payment.accountReceivable && Objects.equals(datePaid, payment.datePaid);
    }

    @Override
    public String toString() {
        return ("datePaid: " + datePaid +
                "\naccountReceivable: " + accountReceivable);
    }
}
