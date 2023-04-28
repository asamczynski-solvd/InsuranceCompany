import java.util.Objects;

public class Name {
    private String firstName;
    private String middleName;
    private String lastName;
    private String previousLastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Name(String firstName, String middleName, String lastName) {
        this(firstName, lastName);
        this.middleName = middleName;

    }

    public Name(String firstName, String middleName, String lastName, String previousLastName) {
        this(firstName, middleName, lastName);
        this.previousLastName = previousLastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name = (Name) o;
        return Objects.equals(firstName, name.firstName) && Objects.equals(middleName, name.middleName) && Objects.equals(lastName, name.lastName) && Objects.equals(previousLastName, name.previousLastName);
    }

    @Override
    public String toString() {
        return (firstName + " " + lastName);
    }

    public String getFullName(boolean showMiddleName, boolean showPreviousLastName) {
        String FullName;

        if (showMiddleName && showPreviousLastName) {
            FullName = firstName + " " + middleName + " " + lastName + ", " + previousLastName;
        } else if (!showMiddleName && !showPreviousLastName) {
            FullName = firstName + " " + lastName;
        } else if (showMiddleName && !showPreviousLastName) {
            FullName = firstName + " " + middleName + " " + lastName;
        } else {
            FullName = firstName + " " + lastName + ", previously: " + previousLastName;
        }

        return FullName;
    }
}
