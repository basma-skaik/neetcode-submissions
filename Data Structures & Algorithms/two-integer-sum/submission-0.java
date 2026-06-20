// This soluiton used hashmap (one pass) / time comp O(n) / space cpm O(n)
// nums = [4,5,6]
// map = [(4,0),(5,1)] //true => [0,2]
// target = 10
// complement = 4
// i = 2
// num = 6
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0; i<nums.length; i++){
            int num = nums[i];
            int complement = target - num;
            if(map.containsKey(complement)){
                return new int[] {map.get(complement),i};
            }
            map.put(num,i);
        }
        return new int[] {};
    }
}
