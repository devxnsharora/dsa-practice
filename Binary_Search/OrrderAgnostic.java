
import java.util.*;

public class OrrderAgnostic{
    public static void main(String[] args){
        int arr[] = {56,55,54,53,52,34,23,12,9,6,3,2,-5,-54,-3434};
        int target = 56;
        int index = Orderagnosticans(arr,target);
        System.out.println(index);
    }
    static int Orderagnosticans(int arr[], int target){
        int start = 0;
        int end = arr.length -1;
        // FIND WHETHER ARRAYS IS INC OR DEC
        boolean isAsc = arr[start] < arr[end];

        while(start<=end){
            // int mid = (start + end)/2; for large numbers this can go out of bound
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
            if(target<arr[mid]){
                end = mid - 1;
            }else if(target> arr[mid]){
                start = mid+1;
            }
            }else{
                if(target > arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}