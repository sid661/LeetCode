package groomingSessionClassWork;

public class UniqueCharater {
    public static void main(String[] args) {
        String input = "Mississippi";
        int i, j, count = 0;
        char arr[] = input.toCharArray();
        int n = arr.length;
        for (i = 0; i < n; i++) {
            int flag = 0;
            for (j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
