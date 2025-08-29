//leetcode 2149
//idea make a new array
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int posindex=0;
        int negindex=1;
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                res[posindex] = nums[i];
                posindex += 2;
            }else{
                res[negindex] = nums[i];
                negindex += 2;
            }
        }
        return res;
    }
}