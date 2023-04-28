import java.util.Date;

public class HealthInsurance extends Insurance {
    private float premium;
    private float deductible;
    private int copaySpecialist;
    private int copayPCP;
    private float coinsurance;

    public HealthInsurance(Person person, Date serviceStartDate, String memberID, String groupID, boolean isEmployee, float premium, float deductible, int copaySpecialist, int copayPCP, float coinsurance) {
        super(person, serviceStartDate, memberID, groupID, isEmployee);
        this.premium = premium;
        this.deductible = deductible;
        this.copaySpecialist = copaySpecialist;
        this.copayPCP = copayPCP;
        this.coinsurance = coinsurance;
    }

    public float getPremium() {
        return premium;
    }

    public float getDeductible() {
        return deductible;
    }

    public int getCopaySpecialist() {
        return copaySpecialist;
    }

    public int getCopayPCP() {
        return copayPCP;
    }

    public float getCoinsurance() {
        return coinsurance;
    }

    public void setPremium(float premium) {
        this.premium = premium;
    }

    public void setDeductible(float deductible) {
        this.deductible = deductible;
    }

    public void setCopaySpecialist(int copaySpecialist) {
        this.copaySpecialist = copaySpecialist;
    }

    public void setCopayPCP(int copayPCP) {
        this.copayPCP = copayPCP;
    }

    public void setCoinsurance(float coinsurance) {
        this.coinsurance = coinsurance;
    }

    @Override
    public float percentageCovered() {
        // automatically covers at least 5%
        return 0.95f - coinsurance;
    }

    @Override
    public String toString() {
        return ("premium: " + premium +
                "\ndeductible: " + deductible +
                "\ncopaySpecialist: " + copaySpecialist +
                "\ncopayPCP: " + copayPCP +
                "\ncoinsurance: " + coinsurance);
    }
}
