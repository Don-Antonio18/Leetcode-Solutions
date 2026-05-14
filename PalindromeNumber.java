// Given an integer x, return true if x is a palindrome, and false otherwise.

class PalindromeNumber {
    public boolean isPalindrome(int x) {

        if (x < 10 && x >= 0) {
            return true;
        }

        String newString = Integer.toString(x);
        int length = newString.length();
        // only need to check up to half of string
        for (int i = 0; i < length / 2; i++) {
            if (newString.charAt(i) != newString.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}