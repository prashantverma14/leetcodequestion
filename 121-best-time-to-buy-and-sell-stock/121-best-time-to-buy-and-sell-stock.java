class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int curr = prices[0];
        for(int i=0;i<prices.length;i++){
            int currpro = prices[i]-curr;
            if(currpro>0){
                max = Math.max(currpro,max);
            }else{
                curr = prices[i];
            }
        }
        
        return max;
    }
}