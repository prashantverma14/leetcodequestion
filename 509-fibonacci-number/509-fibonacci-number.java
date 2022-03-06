class Solution {
    public int fib(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;
        int temp = 0;
        for(int i=2;i<n;i++){
            arr[i] = arr[i-1] + arr[i-2];
            
        }
    temp = arr[n-1] + arr[n-2];
        return temp;
        
    }
}