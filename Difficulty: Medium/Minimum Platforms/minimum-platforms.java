class Solution {
    public int minPlatform(int arr[], int dep[]) {
        //  code here
        int n = arr.length;
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int i=1;
        int j=0;
        
        int count = 1;
        int max_count = 1;
        
        while(i<n && j<n) {
            if(arr[i]<=dep[j]) {
                count++;
                i++;
            }
            else {
                count--;
                j++;
            }
            max_count = Math.max(max_count,count);
        }
        
        return max_count;
    }
}
