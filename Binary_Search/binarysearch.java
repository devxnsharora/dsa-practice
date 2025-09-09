import java.util.*;

public class binarysearch{
    public static void main(String[] args){
        int[] arr = {-223,-34,-4,-1,12,4,64,400,401,402,405,664,2454,75753,454535,909886835};
        int target = 64;
        int index = binarysearchans(arr,target);
        System.out.println(index);
    }
    static int binarysearchans(int[] arr,int target){
        int start = 0;
        int end = arr.length -1;

        while(start<=end){
            // int mid = (start + end)/2; for large numbers this can go out of bound
            int mid = start + (end - start)/2;

            if(target<arr[mid]){
                end = mid - 1;
            }else if(target> arr[mid]){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}