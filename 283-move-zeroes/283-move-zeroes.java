class Solution {
    public void moveZeroes(int[] nums) {
        int[] arr = new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!= 0){
                arr[j] = nums[i];
                j++;
            }
        }
        int temp = nums.length-j;
        for(int i=j;i<nums.length;i++){
            arr[i] =0;
        }
        for(int i=0;i<nums.length;i++){
            nums[i] = arr[i];
        }
        
    }
}