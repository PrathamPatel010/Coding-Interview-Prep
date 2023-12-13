//https://leetcode.com/problems/palindrome-number/
package Basics;
import static Basics.ReverseNumber.reverse;

public class PalindromeNumber {

    // just reverse the number and compare it with given number.
    // Time Complexity:O(logNbase10) which is required to reverse a number
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int rev = reverse(x);
        return rev==x;
    }
}
