import java.util.Objects;

public abstract class Insurance {
    protected String memberID;
    protected String groupID;
    protected boolean isEmployee;

    public Insurance(String memberID, String groupID, boolean isEmployee) {
        this.memberID = memberID;
        this.groupID = groupID;
        this.isEmployee = isEmployee;
    }

    public Insurance() {

    }

    public String getMemberID() {
        return memberID;
    }

    public String getGroupID() {
        return groupID;
    }

    public boolean isEmployee() {
        return isEmployee;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public void setGroupID(String groupID) {
        this.groupID = groupID;
    }

    public void setIsEmployee(boolean employee) {
        isEmployee = employee;
    }

    public abstract float calculatePercentageCovered(float coinsurance);

    @Override
    public String toString() {
        return ("memberID: " + memberID + '\'' +
                "\ngroupID: " + groupID + '\'' +
                "\nisEmployee: " + isEmployee);
    }
}
