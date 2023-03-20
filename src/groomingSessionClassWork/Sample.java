package groomingSessionClassWork;

public class Sample extends xyz{
    public Sample(){
        i=2;
    }
   public static int calculateDistance(String word,int z,String printer) {
      char [] printerSequence = printer.toCharArray();
      char[] words = word.toCharArray();
      int distance;
      for(int i =0;i<words.length;i++){
         for(int j = 0; j< printerSequence.length;j++){
            if(words[i]==printerSequence[j]){

            }
         }
      }

    return 1;
   }

   // output 5
   public static void main(String[] args) {
        Sample s =new Sample();
        xyz z = new xyz();
       System.out.println(z.i);
      int distance = calculateDistance("ZXZZY",3,"XYZ");
      System.out.println("Distance Jerry has to move to print the word is: " + distance + " meters");
   }
}
