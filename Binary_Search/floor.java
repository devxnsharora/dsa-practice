public class floor{
    public static void main(String[] args){
        int arr[] = {2,3,5,7,11,14,16,17,18,21,23};
        int target = 1;
        int result = floornum(arr,target);
        System.out.println(result);
    }
    static int floornum(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        if(target<arr[start]){
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

        return end;
    }

}
