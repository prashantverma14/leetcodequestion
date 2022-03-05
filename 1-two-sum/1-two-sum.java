class Solution {
    public int[] twoSum(int[] nums, int target)  {
     Map<Integer,Integer> map = new HashMap<>();
        int value =0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            value = target-nums[i];
            if(map.containsKey(value) && map.get(value)!=i){
                return new int[] {map.get(value),i};
            }
        }
        return null;
        
    }
}