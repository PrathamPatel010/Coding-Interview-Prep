//https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/
package Arrays.Easy;

public class CheckIfSorted {

    // We also need to check if array was originally sorted, then rotated that is also sorted array
    // so in rotated sorted array, only one time there would be case where curr element is greater than next element.
    // which is pivot index.
    // so we can check how many times we are getting curr ele > next ele.
    // if count becomes >1, then we can return false
    public boolean check(int[] nums) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[(i+1)%nums.length]){
                k++;
            }
            if(k>1){
                return false;
            }
        }
        return true;
    }
}
