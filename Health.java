public class Health {
    private float premium;
    private float deductible;
    private int copaySpecialist;
    private int copayPCP;
    private float coinsurance;

    public Health(float premium, float deductible, int copaySpecialist, int copayPCP, float coinsurance) {
        this.premium = premium;
        this.deductible = deductible;
        this.copaySpecialist = copaySpecialist;
        this.copayPCP = copayPCP;
        this.coinsurance = coinsurance;
    }

    public Health() {

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Health health = (Health) o;
        return Float.compare(health.premium, premium) == 0 && Float.compare(health.deductible, deductible) == 0 && copaySpecialist == health.copaySpecialist && copayPCP == health.copayPCP && Float.compare(health.coinsurance, coinsurance) == 0;
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
