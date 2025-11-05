class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int n = arr.length;
        if(n<k) return -1;
        
        int max_sum = 0;
        for(int i=0;i<k;i++) {
            max_sum+=arr[i];
        }
        
        int ws = max_sum;
        for(int i=k;i<n;i++) {
            ws+=arr[i]-arr[i-k];
            max_sum=Math.max(ws,max_sum);
        }
        
        return max_sum;
    }
}