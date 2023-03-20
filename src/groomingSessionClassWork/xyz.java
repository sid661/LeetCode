package groomingSessionClassWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class xyz {
    public int i =0;

    public xyz(){
        i=1;
    }
    public char findKthCharacter(String str, int k) {
        List<String> substrings = new ArrayList<>();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                substrings.add(str.substring(i, j));
            }
        }
        Collections.sort(substrings);
        String concatenatedString = String.join("", substrings);
        return concatenatedString.charAt(k - 1);
    }




}





