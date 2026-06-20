// nums = [2,2,1,3]
// seen = [2]
// i=1 //return true
// nums.length = 4

// nums = [1,2,3,4]
// seen = [1,2,3,4]
// i=4 
// nums.length = 4
class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(seen.contains(nums[i])){
                return true;
            }else{
                seen.add(nums[i]);
            }
        }
        return false;
    }
}