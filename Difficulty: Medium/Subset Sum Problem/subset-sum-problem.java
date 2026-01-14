class Solution {

    static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        int n = arr.length;
        int[][] dp = new int[n][sum+1];
        for(int i=0;i<dp.length;i++) {
            for(int j=0;j<dp[0].length;j++) {
                dp[i][j]=-1;
            }
        }
        
       return sum(0,arr,sum,dp);
        
    }
    
    public static boolean sum(int i,int arr[],int sum,int[][] dp) {
        if(i==arr.length) {
            if(sum==0) {
                return true;
            }
            
            return false;
        }
        
        if(dp[i][sum]!=-1) return (dp[i][sum]==1);
        boolean ans = false;
        boolean skip = sum(i+1,arr,sum,dp);
        if(sum-arr[i]<0){
            ans=skip;
        }
        else {
            boolean pick = sum(i+1,arr,sum-arr[i],dp);
            ans=pick||skip;
        }
        
        
       if(ans) dp[i][sum]=1;
       else dp[i][sum]=0;
       
       return ans;
    }
}