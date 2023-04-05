package GroomingSessionHomeWork;



public class SumOfNumber {
    public static void main(String[] args) {
        int x = 1234;
        int result = sum(x);
        System.out.println(result);
    }

    public static int sum(int num) {
        int sum = 0, remainder;
        while(num!=0){
            remainder=num%10;
            sum= remainder+sum;
            num=num/10;
        }
        return sum;
    }
}
