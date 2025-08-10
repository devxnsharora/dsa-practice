/*136. Single Number leetCode

Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.
*/

class Solution {
    public int singleNumber(int[] nums) {
        HashMap <Integer,Integer> newMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(newMap.containsKey(nums[i])){
                int oldKey = newMap.get(nums[i]);
                newMap.put(nums[i],oldKey+1);
            }else{
                newMap.put(nums[i],1);
            }

        }
    for (int key : newMap.keySet()) {
         if (newMap.get(key) == 1) {
        return key; // This is the single number.
    }
}

return -1;
    }
}

//2. Using HashSet

class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            // If the number is already in the set, remove it.
            if (set.contains(num)) {
                set.remove(num);
            } 
            // If it's not in the set, add it.
            else {
                set.add(num);
            }
        }
        
        // After the loop, the set will have only one element.
        // We can get it using the iterator.
        return set.iterator().next();
    }
}

//3. Second Way using XOR
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int num: nums){
            result = result ^ num;

        }
        return result;
    }
}

