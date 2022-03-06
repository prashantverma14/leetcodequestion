class Solution {
    public int subarraySum(int[] nums, int k) {
        int ans =0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum =0;
        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
            int rsum = sum-k;
            if(map.containsKey(rsum)){
                ans = ans + map.get(rsum);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return ans;
        
    }
}