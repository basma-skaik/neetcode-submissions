// nums = [2,2,1,3]
// sorted nums = [1,2,2,3]
// left = 1 right = 2 // return true
// nums.length = 4
class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = 1;
        while(right < nums.length){
            if(nums[left] == nums[right]){
                return true;
            }
            left++;
            right++;
        }
        return false;
    }
}