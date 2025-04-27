package isPalindrome;

public class Solution {
//    public boolean isPalindrome(int x) {
//
//        if (x < 0){
//            return false;
//        }
//        String str = String.valueOf(x);
//        char[] charArray = str.toCharArray();
//
//        int numberOfMoves = (charArray.length / 2);
//        System.out.println("numberOfMoves is: " + numberOfMoves);
//
//        for (int i = 0; i < numberOfMoves; i++){
//            int backPointer = charArray.length - 1 - i;
//            if (charArray[i] != charArray[backPointer])
//                return false;
//        }
//
//        return true;
//    }

    public boolean isPalindrome(int x) {

        // any number that is negative or ends with zero will be false
        if (x < 0 || x > 0 && x % 10 == 0){
            return false;
        }

        int y = 0;

        while( y < x ) {
            y = y * 10 + (x % 10)  ;
            x = x / 10;
            System.out.println(" x is: " + x);
            System.out.println(" y is: " + y);
        }

//        System.out.println(" x is: " + x);
//        System.out.println(" y is: " + y);

        return ( x == y || x == (y / 10));
    }
}
