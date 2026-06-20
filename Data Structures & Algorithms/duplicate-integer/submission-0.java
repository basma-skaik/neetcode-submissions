// nums = [1,2,3,4]
// i=1 j=2
class Solution {
    public boolean hasDuplicate(int[] nums) {
        for(int i =0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}