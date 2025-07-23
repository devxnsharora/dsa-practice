// to check if the array is sorted

import java.util.*;
public class sortedArray{

    public static boolean check(int[] arr){
        // This is ok but can be improved even more

        // boolean check = true;
        // for(int  i = 0;i<arr.length-1;i++){
        //     if(arr[i] <= arr[i+1]){
        //         continue;
        //     }
        //     else{
        //         check = false;
        //     }
        // }
        boolean check = true;
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                check = false;
            }
        }
        return check;
    }
    public static void main(String[] args){
        int[] arr = {4,1};
        boolean answer = check(arr);
        System.out.println(answer);
    }
}