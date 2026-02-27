// User function Template for Java

class Solution {
    public long countFriendsPairings(int n) {
        // code here
        long[] dp = new long[n+1];
        Arrays.fill(dp,-1);
        return count(n,dp);
    }
    
    public long count(int n,long[] dp) {
        if(n<=2) return n;
        if(dp[n]!=-1) return dp[n];
        
        return dp[n] = count(n-1,dp)+(n-1)*count(n-2,dp);
    }
}
