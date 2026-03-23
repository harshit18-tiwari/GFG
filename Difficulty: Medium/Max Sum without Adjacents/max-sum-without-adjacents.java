// User function Template for Java

class Solution {
    int findMaxSum(int arr[]) {
        // code here
        int n = arr.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        
        return sum(0,arr,dp);
    }
    
    int sum(int i, int[] arr, int[] dp) {
        if(i>=arr.length) {
            return 0;
        }
        
        if(dp[i]!=-1) return dp[i];
        
        int take = arr[i] + sum(i+2,arr,dp);
        int skip = sum(i+1,arr,dp);
        
        return dp[i] = Math.max(take,skip);
    }
}