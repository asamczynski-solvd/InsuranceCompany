import java.time.LocalDate;
import java.util.Objects;

public class Invoice {
    private double accountPayable;
    private LocalDate dateDue;
    private LocalDate statementDate;
    private boolean isPaidInFull;

    public Invoice(double accountPayable, LocalDate statementDate) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Invoice invoice = (Invoice) o;
        return Double.compare(invoice.accountPayable, accountPayable) == 0 && isPaidInFull == invoice.isPaidInFull && Objects.equals(dateDue, invoice.dateDue) && Objects.equals(statementDate, invoice.statementDate);
    }

    @Override
    public String toString() {
        return ("accountPayable: " + accountPayable +
                "\ndateDue: " + dateDue +
                "\nstatementDate: " + statementDate +
                "\nisPaidInFull: " + isPaidInFull);

    }
}
