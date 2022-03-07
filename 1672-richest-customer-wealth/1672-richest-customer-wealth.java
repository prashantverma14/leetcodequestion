class Solution {
    public int maximumWealth(int[][] accounts) {
        int len = accounts.length;
        int max =0;
        int ans =0;
        for(int i=0;i<len;i++){
            max =0;
            for(int j=0;j<accounts[i].length;j++){
                max = max + accounts[i][j];
            }
            if(max>=ans){
                ans = max;
            }
        }
        return ans;
        
    }
}