//Unsafe solution
// can be crashed
import java.util.*;

// public class ceiling{

//     static int ceilingnum(int[] arr, int target){
//         int start = 0;
//         int end  = arr.length -1;
//         if(target>arr[end]){
//             return target;
//         }
//         if(target<arr[start]){
//             return arr[start];
//         }
//         while(start<=end){
//             int mid = start + (end - start)/2;
//             if(target<arr[mid]){
//                 if(target>arr[mid-1]){
//                     return arr[mid];
//                 }
//                 end = mid-1;
//             }
//             else if(target>arr[mid]){
//                 if(target<arr[mid+1]){
//                     return arr[mid+1];
//                 }
//                 start = mid+1;
//             }else{
//                 return arr[mid];
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args){
//         int arr[] = {2,3,5,7,11,14,16,17,18,21,23};
//         int target = 100;
//         int result = ceilingnum(arr,target);
//         System.out.println(result);
//     }
// }

public class ceiling{
    public static void main(String[] args){
        int arr[] = {2,3,5,7,11,14,16,17,18,21,23};
        int target = 10;
        int result = ceilingnum(arr,target);
        System.out.println(result);
    }

    static int ceilingnum(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        if(target>arr[end]){
            return -1;
        }
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

        return start;
    }

}
