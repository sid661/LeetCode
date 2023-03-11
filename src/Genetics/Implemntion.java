package Genetics;

public class Implemntion {

    Child child = new Child();

    public void maleParent(Human male) {
        String lastName = male.getLastName();
        child.setFatherIrishColor(male.getIrisColor());
        String address = male.getAddress();
        child.setLastName(lastName);
        child.setAddress(address);
        System.out.println("Fathers Name => " + male.firstName + " Last Name => " + male.lastName + " Gender => " + male.gender + " Address => " + male.address + " Irish Color => " + male.irisColor);

    }

    public void femaleParent(Human female) {
        child.setMotherIrishColor(female.getIrisColor());
        System.out.println("Mothers Name => " + female.firstName + " Last Name => " + female.lastName + " Gender => " + female.gender + " Address => " + female.address + " Irish Color => " + female.irisColor);
    }

    public void childob(String name, String childGender) {

        child.setFirstName(name);
        child.setGenderChild(childGender);
    }

    public void decideIrish() {
        if (child.getFatherIrishColor().equalsIgnoreCase(child.motherIrishColor)) {
            child.setChildirishColor(child.fatherIrishColor);
        } else {
            if (child.getGenderChild().equalsIgnoreCase(Gender.FEMALE.toString())) {
                child.setChildirishColor(child.getFatherIrishColor());
            }
            if (child.getGenderChild().equalsIgnoreCase(Gender.MALE.toString())) {
                child.setChildirishColor(child.motherIrishColor);
            }
        }
        System.out.println(child);

    }
}
