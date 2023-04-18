import java.time.LocalDate;
import java.util.Objects;

public class Payment {
    protected LocalDate datePaid;
    protected double accountReceivable;

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
    public String toString() {
        return ("datePaid: " + datePaid +
                "\naccountReceivable: " + accountReceivable);
    }
}
