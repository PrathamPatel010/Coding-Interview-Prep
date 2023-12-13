//https://leetcode.com/problems/single-number/description/
package Arrays.Easy;

import java.util.Arrays;

public class SingleNumber {
    // Brute Force Approach : Sort the array.
    // Check every second index element.
    public int singleNumber1(int[] nums) {
        if (nums.length==1){
            return nums[0];
        }

        Arrays.sort(nums);
        if (nums[nums.length-1]!=nums[nums.length-2]){
            return nums[nums.length-1];
        }

        for (int i=0;i<nums.length;i+=2){
            if (nums[i]!=nums[i+1]){
                return nums[i];
            }
        }
        return -1;
    }

    // Optimized Approach : Using Math
    // Use XOR operation. If 2 numbers are equal it will produce 0.
    // So, all number that comes twice will produce and XOR operation with single element will return 0.
    public int singleNumber(int[] nums) {
        int ans=0;
        for (int x : nums){
            ans = ans ^ x;
        }
        return ans;
    }
}
