import java.util.*;

public class positionofnumber{
    public static void main(String[] args){
        int[] arr={1,2,3,4,6,9,11,23,45,46,47,48,111,234,434,23232,13333332};
        int target = 48;
        System.out.println(findingans(arr,target));



    }
    static int findingans(int[] arr, int target){
        //first start the range
        //first start with a box of size 2
        int start = 0;
        int end = 1; 
        while(target>arr[end]){
            int newstart = end + 1;
            //double the box value
            //end = previous end + sizeofbox * 2
            //using newstart because we also want the old start to calculate size of box

            end = end + (end -start + 1) * 2;
            start = newstart;
        }
        return Binarysearch(arr,target,start,end);

    }
    static int Binarysearch(int[] arr, int target, int start,int end){
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