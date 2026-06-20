// nums = [2,2,1,3]
// seen = [(2,1)]
// i=1 //return true
// nums.length = 4

// nums = [1,2,3,4]
// seen = [(1,1),(2,1),(3,1),(4,1)]
// i=4 //return false
// nums.length = 4
class Solution {
    public boolean hasDuplicate(int[] nums) {
        Hashtable<Integer,Integer> seen = new Hashtable<>();
        for(int i=0; i<nums.length; i++){
            if(seen.containsKey(nums[i])){
                return true;
            }else{
                seen.put(nums[i],1);
            }
        }
        return false;
    }
}