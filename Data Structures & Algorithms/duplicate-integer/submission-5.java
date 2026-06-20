
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