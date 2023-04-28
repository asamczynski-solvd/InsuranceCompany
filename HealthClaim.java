public class HealthClaim extends Claim {
    private String serviceCode;

    public HealthClaim(HealthInsurance insurancePlan, String serviceCode) {
        super(insurancePlan);
        this.serviceCode = serviceCode;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    @Override
    public String toString() {
        return (super.toString() +
                "\nserviceCode: " + serviceCode);
    }
}
