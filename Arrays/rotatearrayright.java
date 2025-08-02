
//189. Rotate Array
//Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        rotateArrays(nums,0,nums.length-1);
        rotateArrays(nums,0,k-1);
        rotateArrays(nums,k,nums.length-1);
    //------------------Brute force way------
    //Time complexity --- O(n*k)
    //Space complexity - O(n)
    //     for(int i = 0;i<k;i++){
    //         int temp = nums[nums.length-1];
    //         for(int j = nums.length-1;j>0;j--){
    //             nums[j] = nums[j-1]; 
    //         }
    //         nums[0] = temp;
    //     }

    //Better approach time complexity - O(n)
    //But space complexity - O(n)
    // int temparr[] = new int[nums.length];
    //     for(int i=0;i<nums.length;i++){
    //         temparr[(i+k)%nums.length] = nums[i];
    //     }
    //     System.arraycopy(temparr,0,nums,0,temparr.length);
    //  }

    //Best approach 
    //time complexity - O(n)
    //Space complexity is O(1)
    //we use 2 pointer approach to solve this
    //one pointer in start and the other in the end
    }
    public static void rotateArrays(int nums[],int start,int end){
        while(start<end){
            int temp = nums[end];
             nums[end] = nums[start];
             nums[start] = temp;
             start++;
             end--;
        }
    }
    
}