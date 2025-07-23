// class Solution {
//     public int removeDuplicates(int[] nums) {
//         // int tracker = 0;
//         // for(int scanner = 0;scanner<nums.length-1;scanner++){
//         //     if(nums[scanner] != nums[scanner+1]){
//         //         tracker++;
//         //         nums[tracker] = nums[scanner + 1];
//         //     }
//         // }
//         // return tracker +1;

//     }
// }

// better approach
class Solution {
    public int removeDuplicates(int[] nums) {
        int tracker = 0;
        for(int scanner = 1;scanner<nums.length;scanner++){
            if(nums[scanner] != nums[tracker]){
                tracker++;
                nums[tracker] = nums[scanner];
                
            }
        }
        return tracker+1;

    }
}