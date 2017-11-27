package io.zipcoder;

public class Problem4 {

    public String winterIsComing(String string) {
        int n = string.length();
        int alphabet[] = new int[26]; //given the sample input, think i need to go through the alphabet? this probably only works for this specific problem :(.

        //want to iterate through the length of the alphabet to check for odds and evens. if odd return NO, if even return YES.
        for (int i = 0; i < string.length(); i++) {
            alphabet[string.charAt(i) - 'a']++;
        }
        if (n % 2 == 0) {
            for (int i = 0; i < 26; i++) {
                if (alphabet[i] % 2 != 0) {
                    return "NO";
                }
            }
            return "YES";
        }
        else {
            int x = 0;
            for (int i = 0; i < 26; i++) {
                if (alphabet[i] % 2 != 0 && x < 1) {
                    x++;
                } else if (alphabet[i] % 2 != 0) {
                    return "NO";
                }
            }
            return "YES";
        }
    }
}
