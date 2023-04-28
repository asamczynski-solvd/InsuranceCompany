import java.util.Calendar;

public class Claim<T extends Insurance> {
    protected T insurancePlan;
    protected boolean isCovered;

    public Claim(T insurancePlan) {
        this.insurancePlan = insurancePlan;
        checkIsCovered();
    }

    public T getInsurancePlan() {
        return insurancePlan;
    }

    public boolean isCovered() {
        return isCovered;
    }

    public void setInsurancePlan(T insurancePlan) {
        this.insurancePlan = insurancePlan;
    }

    public void checkIsCovered() {
        Calendar today = Calendar.getInstance();
        if (insurancePlan.getServiceEndDate().before(today.getTime())) {
            isCovered = true;
        } else {
            isCovered = false;
        }
    }

    @Override
    public String toString() {
        return ("insurancePlan: " + insurancePlan +
                "\nisCovered: " + isCovered);
    }
}
