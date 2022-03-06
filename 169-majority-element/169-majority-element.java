class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length ==1 ) return 1;
        HashMap<Integer,Integer> map = new HashMap<>();
       for(int i=0;i<nums.length;i++){
           if(map.containsKey(nums[i])){
               int n= map.get(nums[i]) + 1;
               if(n>(nums.length/2)) return nums[i];
               map.put(nums[i],n);
           }else{
               map.put(nums[i],1);
           }
           
       }
        
        return -1;
    }
}