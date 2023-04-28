public class AutoClaim extends Claim {
    private boolean isAtFault;

    public AutoClaim(AutoInsurance insurancePlan, boolean isAtFault) {
        super(insurancePlan);
        this.isAtFault = isAtFault;
    }

    public boolean isAtFault() {
        return isAtFault;
    }

    public void setAtFault(boolean atFault) {
        isAtFault = atFault;
    }

    @Override
    public String toString() {
        return (super.toString() +
                "\nisAtFault: " + isAtFault);
    }
}
