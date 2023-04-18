import java.util.Date;

public class Invoice extends Payment {
    private double accountPayable;
    private Date dateDue;
    private Date statementDate;
    private boolean isPaidInFull;

    public Invoice(Date datePaid, double accountReceivable, Date statementDate) {
        super(datePaid, accountReceivable);
        this.statementDate = statementDate;
    }

    public Invoice(double accountPayable, Date statementDate) {
        super();
        this.accountPayable = accountPayable;
        this.statementDate = statementDate;
    }

    public Invoice(double accountPayable, Date statementDate, boolean isPaidInFull) {
        this(accountPayable, statementDate);
        this.isPaidInFull = isPaidInFull;
    }

    public Invoice(double accountPayable, Date dateDue, Date statementDate, boolean isPaidInFull) {
        this(accountPayable, statementDate, isPaidInFull);
        this.dateDue = dateDue;
    }

    public Invoice() {

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
