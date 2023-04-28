import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Invoice {
    private double accountPayable;
    private Date dateDue;
    private Date statementDate;
    private boolean isPaidInFull;

    private Payment payment;

    public Invoice(double accountPayable, Date statementDate) {
        this.accountPayable = accountPayable;
        this.statementDate = statementDate;
    }

    public Invoice(double accountPayable, Date statementDate, boolean isPaidInFull, Payment payment) {
        this(accountPayable, statementDate);
        this.isPaidInFull = isPaidInFull;
        Calendar c = new GregorianCalendar(statementDate.getYear(), statementDate.getMonth(), statementDate.getDay());
        c.add(Calendar.DATE, 30);
        this.dateDue = c.getTime();
        this.payment = payment;
    }

    public double getAccountPayable() {
        return accountPayable;
    }

    public Date getDateDue() {
        return dateDue;
    }

    public Date getStatementDate() {
        return statementDate;
    }

    public boolean getIsPaidInFull() {
        return isPaidInFull;
    }

    public void setAccountPayable(double accountPayable) {
        this.accountPayable = accountPayable;
    }

    public void setDateDue(Date dateDue) {
        this.dateDue = dateDue;
    }

    public void setStatementDate(Date statementDate) {
        this.statementDate = statementDate;
    }

    public void setIsPaidInFull(boolean isPaidInFull) {
        this.isPaidInFull = isPaidInFull;
    }


    @Override
    public String toString() {
        return ("accountPayable: " + accountPayable +
                "\ndateDue: " + dateDue +
                "\nstatementDate: " + statementDate +
                "\nisPaidInFull: " + isPaidInFull);

    }
}
