import java.util.Date;

public abstract class Insurance {
    protected String memberID;
    protected String groupID;
    protected boolean isEmployee;
    protected Person person;
    protected Date serviceStartDate;
    protected Date serviceEndDate;

    public Insurance(Person person, Date serviceStartDate, String memberID, String groupID, boolean isEmployee) {
        this.person = person;
        this.serviceStartDate = serviceStartDate;
        this.memberID = memberID;
        this.groupID = groupID;
        this.isEmployee = isEmployee;
        this.serviceEndDate = new Date(serviceStartDate.getYear() + 1, serviceStartDate.getMonth(), serviceStartDate.getDate());
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Date getServiceStartDate() {
        return serviceStartDate;
    }

    public void setServiceStartDate(Date serviceStartDate) {
        this.serviceStartDate = serviceStartDate;
    }

    public Date getServiceEndDate() {
        return serviceEndDate;
    }

    public void setServiceEndDate(Date serviceEndDate) {
        this.serviceEndDate = serviceEndDate;
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

    public abstract float percentageCovered();

    @Override
    public String toString() {
        return (person +
                "\nmemberID: " + memberID + '\'' +
                "\ngroupID: " + groupID + '\'' +
                "\nisEmployee: " + isEmployee +
                "\nserviceStartDate: " + serviceStartDate +
                "\nserviceEndDate: " + serviceEndDate);

    }
}
