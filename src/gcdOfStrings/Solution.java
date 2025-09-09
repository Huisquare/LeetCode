package gcdOfStrings;

public class Solution {
    public String gcdOfStrings(String str1, String str2) {

        if (!(str1 + str2).equals(str2 + str1)){
            return "";
        }

        // find the gcd of length(str1) and length(str2) using the euclid algorithm
        int gcd = gcd(str1.length(), str2.length());
        // System.out.println("the gcd is: " + gcd);
        return str1.substring(0, gcd);
    }

    public int gcd(int a, int b){

        while(b != 0){
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        return a;
    }
}
