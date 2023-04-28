import java.util.Date;
import java.util.Objects;

public class Payment {
    protected Date datePaid;
    protected double accountReceivable;

    public Payment(Date datePaid, double accountReceivable) {
        this.datePaid = datePaid;
        this.accountReceivable = accountReceivable;
    }

    public Date getDatePaid() {
        return datePaid;
    }

    public double getAccountReceivable() {
        return accountReceivable;
    }

    public void setDatePaid(Date datePaid) {
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
