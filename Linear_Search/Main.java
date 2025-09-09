import java.util.*;

public class Main {
    public static void main(String[] args){
        int[] nums = {5,3,55,22,53,78,13,9};
        int target = 90;
        int ans = linearSearch(nums,target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int  i = 0;i<arr.length;i++){
            // check for element at every index if it is equal to targe
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }
}