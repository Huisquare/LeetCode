package LongestSubstringWithoutRepeatChar;

import java.util.*;

public class Solution {
    public int lengthOfLongestSubstring(String s) {

        int l = 0;
        int len = 0;
        int maxLength = 0;

        HashSet<Character> hashSet = new HashSet<>();

        for (int r = 0; r < s.length(); r++){

            Character currentChar = s.charAt(r);

            if (hashSet.contains(currentChar)){
                while (hashSet.contains(currentChar)) {
                    hashSet.remove(s.charAt(l));
                    l++;
                }
            }
            hashSet.add(currentChar);
            len = r - l + 1;
            maxLength = Math.max(len, maxLength);

        }
        return maxLength;
    }
}
