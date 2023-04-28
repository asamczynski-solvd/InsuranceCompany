import java.util.Date;

public class AutoInsurance extends Insurance {
    private float deductible;
    private int collisionCoverage;
    private int medicalCoverage;
    private int liabilityCoverage;
    private int comprehensiveCoverage;
    private float premium;
    private float coinsurance;

    public AutoInsurance(Person person, Date serviceStartDate, String memberID, String groupID, boolean isEmployee, float deductible, int collisionCoverage, int medicalCoverage, int liabilityCoverage, int comprehensiveCoverage, float premium, float coinsurance) {
        super(person, serviceStartDate, memberID, groupID, isEmployee);
        this.deductible = deductible;
        this.collisionCoverage = collisionCoverage;
        this.medicalCoverage = medicalCoverage;
        this.liabilityCoverage = liabilityCoverage;
        this.comprehensiveCoverage = comprehensiveCoverage;
        this.premium = premium;
        this.coinsurance = coinsurance;
    }

    public float getDeductible() {
        return deductible;
    }

    public int getCollisionCoverage() {
        return collisionCoverage;
    }

    public int getMedicalCoverage() {
        return medicalCoverage;
    }

    public int getLiabilityCoverage() {
        return liabilityCoverage;
    }

    public int getComprehensiveCoverage() {
        return comprehensiveCoverage;
    }

    public float getPremium() {
        return premium;
    }

    public float getCoinsurance() {
        return coinsurance;
    }

    public void setDeductible(float deductible) {
        this.deductible = deductible;
    }

    public void setCollisionCoverage(int collisionCoverage) {
        this.collisionCoverage = collisionCoverage;
    }

    public void setMedicalCoverage(int medicalCoverage) {
        this.medicalCoverage = medicalCoverage;
    }

    public void setLiabilityCoverage(int liabilityCoverage) {
        this.liabilityCoverage = liabilityCoverage;
    }

    public void setComprehensiveCoverage(int comprehensiveCoverage) {
        this.comprehensiveCoverage = comprehensiveCoverage;
    }

    public void setPremium(float premium) {
        this.premium = premium;
    }

    public void setCoinsurance(float coinsurance) {
        this.coinsurance = coinsurance;
    }

    @Override
    public float percentageCovered() {
        return 1.0f - coinsurance;
    }

    @Override
    public String toString() {
        return (super.toString() +
                "deductible: " + deductible +
                "\ncollisionCoverage: " + collisionCoverage +
                "\nmedicalCoverage: " + medicalCoverage +
                "\nliabilityCoverage: " + liabilityCoverage +
                "\ncomprehensiveCoverage: " + comprehensiveCoverage +
                "\npremium: " + premium);
    }
}
