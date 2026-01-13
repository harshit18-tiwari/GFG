class Solution {
    int min(int idx,int[] dp,int[] height) {
        if(idx==0) return 0;
        if(dp[idx]!=-1) return dp[idx];
        
        int right = Integer.MAX_VALUE;
        int left = min(idx-1,dp,height) + Math.abs(height[idx]-height[idx-1]);
        
        if(idx>1) {
            right = min(idx-2,dp,height) + Math.abs(height[idx]-height[idx-2]);
        }
        
        return dp[idx] = Math.min(left,right);
        
    }
    int minCost(int[] height) {
        // code here
        int n = height.length;
        if(height==null || height.length==0) {
            return 0;
        }
        
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        
        return min(n-1,dp,height);
    }
}