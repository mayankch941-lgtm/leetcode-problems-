import java.util.Arrays;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int k = s2.length();

        if (n > k) {
            return false;
        }

        int[] f1 = new int[26];

        // Frequency of s1
        for (char ch : s1.toCharArray()) {
            f1[ch - 'a']++;
        }

        int[] f2 = new int[26];

        // First window of s2
        for (int i = 0; i < n; i++) {
            f2[s2.charAt(i) - 'a']++;
        }

        if (Arrays.equals(f1, f2)) {
            return true;
        }

        // Sliding window
        for (int i = n; i < k; i++) {
            char add = s2.charAt(i);
            f2[add - 'a']++;

            char remove = s2.charAt(i - n);
            f2[remove - 'a']--;

            if (Arrays.equals(f1, f2)) {
                return true;
            }
        }

        return false;
    }
}