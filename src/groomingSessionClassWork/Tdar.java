package groomingSessionClassWork;



public class Tdar {
    public static void main(String[] args) {
       String stack = "sadbutsad";
        String needle = "sad";
        //needle ko stack mein dhoond na hai
        int x = stack.length();
        int y = needle.length();
        int z = x-y;
        //9-3  because of substring length of sad cannot be found after 6 index so it would useless
      //  System.out.println(z);
        for(int i=0;i<=z;i++){
            if(stack.substring(i,i+y).equals(needle)){//(6,9)
                System.out.println(i);
            }
        }
    }
}
