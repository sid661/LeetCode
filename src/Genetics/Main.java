package Genetics;

public class Main {
    public static void main(String[] args) {
        Implemntion implemntion = new Implemntion();
        Human male = new Human();
        male.setFirstName("Ravinder");
        male.setLastName("Kaushik");
        male.setGender("male");
        male.setIrisColor("black");
        male.setAddress("1/123 Jodhpur");

        Human female = new Human();
        female.setFirstName("Nishita");
        female.setLastName("Bisht");
        female.setGender("female");
        female.setIrisColor("blue");
        female.setAddress("31 alankar vihar");
        implemntion.maleParent(male);
        implemntion.femaleParent(female);
        implemntion.childob("Neema", "female");
        implemntion.decideIrish();
    }


}
