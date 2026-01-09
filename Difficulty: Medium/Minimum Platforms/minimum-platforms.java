class Solution {
    public int minPlatform(int arr[], int dep[]) {
        
        int n = arr.length;

        Arrays.sort(arr);
        Arrays.sort(dep);

        int i = 0, j = 0;
        int plat = 0, maxPlat = 0;

        while (i < n && j < n) {

            if (arr[i] <= dep[j]) {
                plat++;
                maxPlat = Math.max(maxPlat, plat);
                i++;
            }
            else {
                plat--;
                j++;
            }
        }

        return maxPlat;
    }
}
