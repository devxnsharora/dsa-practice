//Brute Force method
class Solution {
    public int majorityElement(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int currentCount = 0;
            for(int j= 0;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    currentCount++;
                }
                if(currentCount> nums.length/2){
                    return nums[i];
                }
            }
        }
        return -1;
    }
}

//Complex Hash Solution
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> myMap = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(myMap.containsKey(nums[i])){
                int oldValue = myMap.get(nums[i]);
                myMap.replace(nums[i],oldValue,oldValue+1);
                if((oldValue+1)>nums.length/2){
                    return nums[i];
                }
            }else{
            myMap.put(nums[i],1);
                            if (1 > nums.length / 2) {
                    return nums[i];
                }
            }
        }
        return -1;
    }
}

//Better Hash Solution
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> myMap = new HashMap<>();
        for(int num : nums){
            int count = myMap.getOrDefault(num,0);
            myMap.put(num, count+1);
            if(myMap.get(num)>nums.length/2){
                return num;
            }
        }
        return -1;
    }
}

//Moore's Voting Algorithm

class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;
        for(int i =0;i<nums.length;i++){
            if(count == 0){
                candidate = nums[i];
            }
            if(nums[i] == candidate){
                count++;
            }else{
                count--;
            }
        }
        return candidate;
    }
}

