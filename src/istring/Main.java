package istring;

public class Main {
    public static void main(String[] args) {
        String str1 = "acca";
        String str2 = "acca";
        Impl impl = new Impl();
        Boolean finalresult = impl.ddr(str1,str2);
        System.out.println(str1 +"  "+str2+"  "+finalresult );


    }
}
