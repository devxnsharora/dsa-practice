//Striver SDE sheet Arrays - Easy 
// GeeksforGeeks Largest Element in Array


class Solution {
    public static int largest(int[] arr) {
        // code here
        if(arr == null || arr.length == 0){
            return -1;
        }
        int largest = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] >= largest){
                largest = arr[i];
            }
        }
        return largest;
    }
}
