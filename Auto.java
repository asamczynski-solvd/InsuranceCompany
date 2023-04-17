import java.util.Objects;

public class Auto {
    private float deductible;
    private int collisionCoverage;
    private int medicalCoverage;
    private int liabilityCoverage;
    private int comprehensiveCoverage;
    private float premium;

    public Auto(float deductible, int collisionCoverage, int medicalCoverage, int liabilityCoverage, int comprehensiveCoverage, float premium){
        this.deductible = deductible;
        this.collisionCoverage = collisionCoverage;
        this.medicalCoverage = medicalCoverage;
        this.liabilityCoverage = liabilityCoverage;
        this.comprehensiveCoverage =comprehensiveCoverage;
        this.premium = premium;
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
                "\npremium: " + premium );
    }
}
