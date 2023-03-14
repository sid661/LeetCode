package istring;

public class Impl {
    Istring instance1 = new Istring();
    Istring instance2 = new Istring();
    public Boolean ddr(String str1,String str2){
        String inversedString1 =instance1.inversedString(str1);
        Boolean resultOfString1=this.checkReversedString(str1,inversedString1);

        String inversedString2 = instance2.inversedString(str2);
        Boolean resultOfString2 =this.checkReversedString(str2,inversedString2);

        if(resultOfString1==true && resultOfString2==true){
            return true;
        }

            return false;
    }

    public Boolean checkReversedString(String initialString, String inversedString ){

        for (int i = 0; i <initialString.length() ; i+=2) {
            if(initialString.charAt(i)!=inversedString.charAt(i)){
                return false;
            }else {
                return true;
            }
        }


        return true;
    }
}
