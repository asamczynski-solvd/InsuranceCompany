

public class Auto {
    private float deductible;
    private int collisionCoverage;
    private int medicalCoverage;
    private int liabilityCoverage;
    private int comprehensiveCoverage;
    private float premium;
    private float coinsurance;

    public Auto(float deductible, int collisionCoverage, int medicalCoverage, int liabilityCoverage, int comprehensiveCoverage, float premium, float coinsurance) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return Float.compare(auto.deductible, deductible) == 0 && collisionCoverage == auto.collisionCoverage && medicalCoverage == auto.medicalCoverage && liabilityCoverage == auto.liabilityCoverage && comprehensiveCoverage == auto.comprehensiveCoverage && Float.compare(auto.premium, premium) == 0;
    }

    @Override
    public String toString() {
        return ("deductible: " + deductible +
                "\ncollisionCoverage: " + collisionCoverage +
                "\nmedicalCoverage: " + medicalCoverage +
                "\nliabilityCoverage: " + liabilityCoverage +
                "\ncomprehensiveCoverage: " + comprehensiveCoverage +
                "\npremium: " + premium);
    }
}
