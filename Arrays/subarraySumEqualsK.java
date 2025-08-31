//we use concept of prefix sum
//leetcode 560
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> prefixSum = new HashMap<>();
        int sum = 0;
        int count = 0;
        prefixSum.put(0,1);
        for(int i = 0;i<nums.length;i++){
            sum += nums[i]; 
            int neededSum = sum-k;
            if(prefixSum.containsKey(neededSum)){
                count +=  prefixSum.get(neededSum);
            }
            prefixSum.put(sum,prefixSum.getOrDefault(sum,0)+1);
        }
        return count;
    }
}