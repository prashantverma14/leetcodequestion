class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k=0;
        for(int i=m;i<m+n;i++){
            nums1[i] = nums2[k];
            k++;
        }
         int nr = nums1.length;
        for (int i = 1; i < nr; ++i) {
            int key = nums1[i];
            int j = i - 1;
 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && nums1[j] > key) {
                nums1[j + 1] = nums1[j];
                j = j - 1;
            }
            nums1[j + 1] = key;
        }
        
        
    }
}