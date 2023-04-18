import java.util.Objects;

public class Claim<T> {
    private T claimType;
    private boolean isCovered;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Claim<?> claim = (Claim<?>) o;
        return isCovered == claim.isCovered && Objects.equals(claimType, claim.claimType);
    }

    @Override
    public String toString() {
        return ("claimType: " + claimType +
                "\nisCovered: " + isCovered);
    }
}
