class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int sumSoFar = 0;
        int minSumSoFar = 0;
        for(int i = 0;i<nums.length;i++){
            total += nums[i];
            sumSoFar += nums[i];
            minSumSoFar += nums[i];
            if(sumSoFar>maxSum){
                maxSum =sumSoFar;
            }
            if(minSumSoFar<minSum){
                minSum = minSumSoFar;
            }
            if(sumSoFar<0){
                sumSoFar = 0;
            }
            if(minSumSoFar>0){
                minSumSoFar = 0;
            }
        }
        if (total  == minSum) {
            return maxSum;
        }
        total = total - minSum;
        return Math.max(maxSum,total);
    }
}