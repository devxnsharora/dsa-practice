//Leetcode 37
//find the next permutation of a number
class Solution {
    public void nextPermutation(int[] nums) {
        int pivot = -1;
        for(int i = nums.length-2;i>=0;i--){
            if(nums[i] < nums[i+1]){
                pivot = i;
                break;
            }
        }
        if (pivot == -1){
            reverseArray(nums,0,nums.length-1);
            return;
        }
        for(int i = nums.length-1;i>pivot;i--){
            if(nums[i]>nums[pivot]){
                swap(nums,pivot,i);
                break;
            }
        }
        reverseArray(nums,pivot+1,nums.length-1);
    }
    public static void reverseArray(int[] nums,int start,int end){
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
    public static void swap(int[] nums,int i,int j){
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }
}