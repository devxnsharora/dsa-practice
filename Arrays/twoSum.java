class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer,Integer> myMap = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int complement = target - nums[i];
            if(myMap.containsKey(complement)){
                int complementIndex = myMap.get(complement);
                return new int[] {i,complementIndex};
            }
            myMap.put(nums[i],i);

        }
        return new int[] {};
    }
}