class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int n = arr.length;
        int sum = 0;
        int max_sum = 0;
        for(int i=0;i<k;i++) {
            sum+=arr[i];
        }
        
        max_sum = sum;
        
        for(int j=k;j<n;j++) {
            sum+=arr[j];
            sum-=arr[j-k];
            max_sum = Math.max(max_sum,sum);
        }
            
            
        return max_sum;
        
    }
}