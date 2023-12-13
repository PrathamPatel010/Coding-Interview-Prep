package Basics;
// https://leetcode.com/problems/reverse-integer/description/
public class ReverseNumber {

    public static void main(String[] args) {
        int a = 123;
        System.out.println(reverse(a));
    }

//    Time Complexity:O(logx)to the base 10 because in each iteration of while loop
//    we are dividing the number by 10.
    public static int reverse(int x) {
        int rev=0;
        while (x != 0) {
            int rem = x % 10;
            x /= 10;
            // Check for overflow before updating the result
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && rem > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && rem < -8)) {
                return 0;
            }
            rev = rev * 10 + rem;
        }
        return rev;
    }
}
