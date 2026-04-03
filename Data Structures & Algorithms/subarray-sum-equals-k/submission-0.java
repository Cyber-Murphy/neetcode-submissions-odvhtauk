class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int count=0;
        for(int l=0;l<nums.length;l++)
        {
            int r=l;
            int sum=0;
            while(r<nums.length){
                sum+=nums[r];
                if(sum==k){
                    count++;
                }
                r++;
            }
        }
        return count;
    }
}