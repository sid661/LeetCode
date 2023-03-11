package Genetics;

public class Child extends Human {
    String firstName;
    String genderChild;
    String fatherIrishColor;
    String motherIrishColor;
    String childirishColor;


    public Child() {
    }


    public Child(String firstName, String lastName, String gender, String irisColor, String address, String firstName1, String genderChild, String fatherIrishColor, String motherIrishColor) {
        super(firstName, lastName, gender, irisColor, address);
        this.firstName = firstName1;
        this.genderChild = genderChild;
        this.fatherIrishColor = fatherIrishColor;
        this.motherIrishColor = motherIrishColor;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGenderChild() {
        return genderChild;
    }

    public void setGenderChild(String genderChild) {
        this.genderChild = genderChild;
    }

    public String getFatherIrishColor() {
        return fatherIrishColor;
    }

    public void setFatherIrishColor(String fatherIrishColor) {
        this.fatherIrishColor = fatherIrishColor;
    }

    public String getMotherIrishColor() {
        return motherIrishColor;
    }

    public void setMotherIrishColor(String motherIrishColor) {
        this.motherIrishColor = motherIrishColor;
    }

    public String getChildirishColor() {
        return childirishColor;
    }

    public void setChildirishColor(String childirishColor) {
        this.childirishColor = childirishColor;
    }

    @Override
    public String toString() {
        return
                "firstName=>'" + firstName + '\'' +
                " last name=>'" + lastName + '\'' +
                " genderChild=>'" + genderChild + '\'' +
                " IrishColor=>'" + childirishColor + '\'' +
                " Addrress=>'" + address + '\'' ;
    }
}
