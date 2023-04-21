import java.util.Objects;

public class Claim<T> extends Insurance {
    protected T claimType;
    protected boolean isCovered;

    public Claim(T claimType, boolean isCovered) {
        this.claimType = claimType;
        this.isCovered = isCovered;
    }

    public Claim() {

    }

    public T getClaimType() {
        return claimType;
    }

    public boolean isCovered() {
        return isCovered;
    }

    public void setClaimType(T claimType) {
        this.claimType = claimType;
    }

    public void setIsCovered(boolean isCovered) {
        this.isCovered = isCovered;
    }

    @Override
    public float calculatePercentageCovered(float coinsurance) {
        return 1.0f - coinsurance;
    }

    @Override
    public String toString() {
        return ("claimType: " + claimType +
                "\nisCovered: " + isCovered);
    }
}
