import java.time.LocalDate;

public class Invoice extends Payment {
    private double accountPayable;
    private LocalDate dateDue;
    private LocalDate statementDate;
    private boolean isPaidInFull;

    public Invoice(LocalDate datePaid, double accountReceivable, LocalDate statementDate) {
        super(datePaid, accountReceivable);
        this.statementDate = statementDate;
    }

    public Invoice(double accountPayable, LocalDate statementDate) {
        super();
        this.accountPayable = accountPayable;
        this.statementDate = statementDate;
    }

    public Invoice(double accountPayable, LocalDate statementDate, boolean isPaidInFull) {
        this(accountPayable, statementDate);
        this.isPaidInFull = isPaidInFull;
    }

    public Invoice(double accountPayable, LocalDate dateDue, LocalDate statementDate, boolean isPaidInFull) {
        this(accountPayable, statementDate, isPaidInFull);
        this.dateDue = dateDue;
    }

    public Invoice() {

    }

    public double getAccountPayable() {
        return accountPayable;
    }

    public LocalDate getDateDue() {
        return dateDue;
    }

    public LocalDate getStatementDate() {
        return statementDate;
    }

    public boolean getIsPaidInFull() {
        return isPaidInFull;
    }

    public void setAccountPayable(double accountPayable) {
        this.accountPayable = accountPayable;
    }

    public void setDateDue(LocalDate dateDue) {
        this.dateDue = dateDue;
    }

    public void setStatementDate(LocalDate statementDate) {
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
