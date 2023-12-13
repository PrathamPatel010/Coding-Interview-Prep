//https://leetcode.com/problems/rotate-array/
package Arrays.Easy;

public class RotateArray {
    // Brute Force Approach: Using Temp array.
    // Store k elements, shift other element. Then move k element into array.
    public void rotate1(int[] nums, int k) {
        int n = nums.length;
        if (n==0){
            return;
        }
        k = k % n;
        if (k>n){
            return;
        }
        int[] temp = new int[k];

        for (int i=n-k;i<n;i++){
            temp[i-(n-k)] = nums[i];
        }

        for (int i=n-k-1;i>=0;i--){
            nums[i+k] = nums[i];
        }

        for (int i=0;i<k;i++){
            nums[i] = temp[i];
        }
    }

    // Optimized Approach : Reversal Algorithm
    // Reverse the last k elements, reverse the first n-k elements. Reverse the whole array.
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        if (k>n){
            return;
        }
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-k-1);
        reverse(nums,0,n-1);
    }

    static void reverse(int[] arr, int start, int end){
        while (start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
