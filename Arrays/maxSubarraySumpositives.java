// You can copy and paste this entire block of code into an online Java compiler.

// The main class that online compilers will look for to run the program.
public class Main {
    public static void main(String[] args) {
        // Create an instance of the Solution class to use its method.
        Solution solution = new Solution();

        // --- Test Case 1 ---
        int[] nums1 = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
        int k1 = 54;
        System.out.println("Running your logic on Test Case 1...");
        System.out.println("Output: " + solution.longestSubarray(nums1, k1));
        System.out.println("----------------------------------------");


        // --- Test Case 2 ---
        // Let's create a new instance of Solution to reset the state, since your
        // `sum` variable is part of the class in the original thought process.
        Solution solution2 = new Solution();
        int[] nums2 = {4, 1, 1, 1, 2, 3, 5};
        int k2 = 5;
        System.out.println("Running your logic on Test Case 2...");
        System.out.println("Output: " + solution2.longestSubarray(nums2, k2));
        System.out.println("----------------------------------------");
    }
}


// Your Solution class with your original logic.
class Solution {
    public int longestSubarray(int[] nums, int k) {
        // Your original placement of the sum variable.
        //This is the brute force way
        //the time complexity of this is O(n^2)
        //wont work for longer arrays
        
    //     int length = 0; 
        
    //     for(int i = 0; i < nums.length; i++){
    //         int currentlength=0;
    //          int sum = 0;

    //         for(int j=i; j < nums.length; j++){
    //             sum = sum + nums[j];
    //             if (sum == k) {
    // // If we have an exact match, calculate the length of THIS specific subarray.
    //             int currentLength = j - i + 1;
    
    // // And only now, check if this is the new longest valid subarray.
    //             if (currentLength > length) {
    //                 length = currentLength;
    //             }
    //         }
    //         }
    //     }
    //     return length;

    //2. Sliding window algorithm
public class Solution {
    public static int longestSubarrayWithSumK(int []a, long k) {
        int left  = 0;
        long sum = 0;
        int maxLength = 0;
        for(int right = 0;right<a.length;right++){
            sum = sum + a[right];
            while(sum>k){
                sum= sum-a[left];
                left++;
            }
            if(sum == k){
                int length = right - left + 1;
                maxLength = Math.max(length,maxLength);
            }
        }
        return maxLength;
    }
}
    }
}