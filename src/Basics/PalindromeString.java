//https://leetcode.com/problems/valid-palindrome/
package Basics;
public class PalindromeString {

//    we will maintain 2-pointers, one starting from start, other from end.
//    we need to ignore white spaces, also if string is empty we need to return true
//    Time Complexity:O(N), N=length of string. because we are iterating over whole string
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }

        int start=0;
        int end=s.length()-1;
        while (start<=end) {
            char startChar = s.charAt(start);
            char endChar = s.charAt(end);

            if (!Character.isLetterOrDigit(startChar)) {
                start++;
            } else if (!Character.isLetterOrDigit(endChar)) {
                end--;
            } else {
                if (Character.toLowerCase(startChar) != Character.toLowerCase(endChar)) {
                    return false;
                }
                start++;
                end--;
            }
        }
        // at the end, we can return true.
        return true;
    }
}
