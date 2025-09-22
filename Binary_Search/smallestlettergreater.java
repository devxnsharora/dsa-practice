//Leetcode 744
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        if(target >= letters[end]){
            return letters[0];
        }
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<letters[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return letters[start];
    }
}

//BETTER SOLUTION BY USING MODULO

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<letters[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return letters[start % letters.length];
    }
}