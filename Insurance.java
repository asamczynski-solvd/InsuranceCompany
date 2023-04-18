import java.util.Objects;

public class Insurance {
    private String memberID;
    private String groupID;
    private boolean isEmployee;
    public Insurance(String memberID, String groupID, boolean isEmployee){
        this.memberID = memberID;
        this.groupID = groupID;
        this.isEmployee = isEmployee;
    }
    public Insurance(){

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Insurance insurance = (Insurance) o;
        return isEmployee == insurance.isEmployee && Objects.equals(memberID, insurance.memberID) && Objects.equals(groupID, insurance.groupID);
    }

    @Override
    public String toString() {
        return ("memberID: " + memberID + '\'' +
                "\ngroupID: " + groupID + '\'' +
                "\nisEmployee: " + isEmployee );
    }
}
