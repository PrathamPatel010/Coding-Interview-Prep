//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
package Arrays.Easy;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {
    // Brute Force Approach: Just use HashSet.
    // put all elements in set. put back elements from set to array.
    public int removeDuplicates1(int[] nums) {
        HashSet<Integer>set = new HashSet<Integer>();
        for (int num : nums) {
            set.add(num);
        }
        int j=0;
        for (int x : set){
            nums[j++]=x;
        }
        Arrays.sort(nums);
        return set.size();
    }

    // Optimized Approach - Using 2-pointers
    public int removeDuplicates(int[] nums) {
        // i start at 0, j start from 1 to end of array.
        // we'll keep moving j unless we find element[i]!=element[j]
        int i=0;
        for (int j=1;j<nums.length;j++){
            if (nums[i]!=nums[j]){
                // here we'll update ele[i] with ele[j]
                i++;
                nums[i]=nums[j];
            }
        }
        // at the end we will return i+1 as size of array without duplicates, bcuz index starts from 0.
        return i+1;
    }
}
