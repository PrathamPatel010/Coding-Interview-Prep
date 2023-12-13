//https://leetcode.com/problems/move-zeroes/
package Arrays.Easy;

import java.util.ArrayList;
import java.util.List;

public class MoveZeros {

    // Brute Force : Using List
    // Put all non-zero ele. in list. And put back in array from start. Fill remaining with zeros.
    public void moveZeroes1(int[] nums) {
        int n = nums.length;

        List<Integer> temp = new ArrayList<>();
        for (int x : nums){
            if (x!=0){
                temp.add(x);
            }
        }
        int listSize = temp.size();

        for (int i=0;i<listSize;i++){
            nums[i] = temp.get(i);
        }

        for (int i=listSize;i<n;i++){
            nums[i]=0;
        }
    }

    // Optimized Approach : Using 2-pointers
    public void moveZeroes(int[] nums) {
        // Find first occurrence of zero
        int i=Integer.MIN_VALUE;
        for (int index=0;index<nums.length;index++){
            if (nums[index]==0){
                i=index;
                break;
            }
        }

        if (i<0){
            return;
        }

        // start j-pointer from i+1. Move j untill we get non-zero element.
        // when we get non-zero element,swap i & j,increment i&j.
        for (int j=i+1;j< nums.length;j++){
            if (nums[j]!=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
    }
}
