package Genetics;

public class Human {
    String firstName;
    String lastName;
    String gender;
    String irisColor;
    String address;

    public Human() {
    }

    public Human(String firstName, String lastName, String gender, String irisColor, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.irisColor = irisColor;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIrisColor() {
        return irisColor;
    }

    public void setIrisColor(String irisColor) {
        this.irisColor = irisColor;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", irisColor='" + irisColor + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}