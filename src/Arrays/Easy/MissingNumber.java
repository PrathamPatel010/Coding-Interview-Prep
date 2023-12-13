//https://leetcode.com/problems/missing-number/
package Arrays.Easy;

import java.util.Arrays;

public class MissingNumber {
    // Brute Force : Sort the array.
    // then compare index with element.
    public int missingNumber1(int[] nums) {
        Arrays.sort(nums);

        for (int i=0;i<nums.length;i++){
            if (nums[i]!=i){
                return i;
            }
        }

        return nums.length;
    }

    // Optimized Approach : Using Math Formula.
    // Calculate Sum of n numbers using formula. Find sum of all eleme. of array.
    // Find difference that's missing number.
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sumOfNumbers = ((n)*(n+1))/2;
        int sum=0;
        for (int i : nums){
            sum += i;
        }
        return sumOfNumbers-sum;
    }
}
