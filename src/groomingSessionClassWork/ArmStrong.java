package groomingSessionClassWork;

public class ArmStrong {
    public static void main(String[] args) {
        int n = 143;
        int remainder = 0;
        int temp = n;
        int sum = 0;
        while (n != 0) {
            remainder = n % 10;
            sum = (remainder * remainder * remainder) + (sum);
            n = n / 10;
        }
        if (sum == temp) {
            System.out.println("armstrong");
        } else System.out.println("not armstromg");
    }
}
