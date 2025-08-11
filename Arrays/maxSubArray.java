//Kadane Algorithm
//Logic - concept of local and global variables
// Iterate only once so that the time complexity is o(n)

class Solution {
    public int maxSubArray(int[] nums) {
        int sum = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            int currentSum = 0;
            for(int j = i;j<nums.length;j++){
                currentSum += nums[j];
                if(currentSum>sum){
                    sum = currentSum;
                }
            }
        }
        return sum;
    }
}