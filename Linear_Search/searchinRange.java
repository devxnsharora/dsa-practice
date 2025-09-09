import java.util.*;
//search for 3 in range of index[1,4]
public class searchinRange{
    public static void main(String[] args){
        int[] arr = {3,4,63,2,5,23,6,31,63};
        int target = 3;
        System.out.println(linearSearch(arr,target,2,7));
    }
    static int linearSearch(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for(int  i = start;i<=end;i++){
            // check for element at every index if it is equal to targe
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }
}