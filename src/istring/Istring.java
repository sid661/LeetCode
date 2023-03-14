package istring;
/*
    Class IString stores the inverse of a given String. Two instances of IString are considered
    equal if the characters at odd numbered positions in the "inversed strings" are the same.
    Implement the class and a test program.*/


public class Istring {
     String initialString;
     String inversed;

    public Istring() {
    }

    public String getInitialString() {
        return initialString;
    }

    public void setInitialString(String initialString) {
        this.initialString = initialString;
    }

    public String getInversed() {
        return inversed;
    }

    public void setInversed(String inversed) {
        this.inversed = inversed;
    }
    public String inversedString(String str){
        this.setInitialString(str);
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        String strReversed =stringBuilder.toString();
        this.setInversed(strReversed);
        return strReversed;
    }

}
