class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        int lo = 0;
        int hi = n-1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
           if(hi==lo&&hi==mid)return nums[mid];
           if(nums[hi]>nums[mid]) hi = mid;
           else lo = mid+1;
        }
        return nums[0];
    }
}