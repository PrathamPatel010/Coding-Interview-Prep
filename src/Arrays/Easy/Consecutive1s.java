//https://leetcode.com/problems/max-consecutive-ones/description/

package Arrays.Easy;

public class Consecutive1s {
    // Using Iteration & Comparison
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int max=0;

        for (int x : nums){
            if (x==1){
                count++;
            } else{
                count=0;
            }
            max=Math.max(count,max);
        }
        return max;
    }
}
