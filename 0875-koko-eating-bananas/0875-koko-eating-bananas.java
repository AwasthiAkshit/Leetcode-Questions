class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int Max = 0;
        for(int i=0;i<n;i++){
            Max = Math.max(Max,piles[i]);
        }
        int lo = 1;
        int hi = Max;
        long totalHours = 0;
        int ans = 1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            totalHours = 0;
            for(int p:piles){
                totalHours += (p+mid-1)/mid;
            }
            if(totalHours==h){
                ans = mid;
                hi = mid-1;
            }
            else if(totalHours>h) lo = mid+1;
            else{
                hi = mid-1;
                ans = mid;
                
            }
        }
        return ans;

    }
}