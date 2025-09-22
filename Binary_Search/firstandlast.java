class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1,-1};
        result[0] = indexsearch(nums,target,true);
        result[1] = indexsearch(nums,target,false);
        return result;
    }
    private int indexsearch(int[] nums,int target, boolean findfirstindex){
        int ans = -1;
        int start = 0;
        int end = nums.length -1;

        while(start<=end){
            // int mid = (start + end)/2; for large numbers this can go out of bound
            int mid = start + (end - start)/2;

            if(target<nums[mid]){
                end = mid - 1;
            }else if(target> nums[mid]){
                start = mid+1;
            }else{
                ans = mid;
                if(findfirstindex){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return ans;        
    }
}