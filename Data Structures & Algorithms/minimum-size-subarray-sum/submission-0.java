class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(sum>=target){
                    min=Math.min(j-i+1,min);
                    break;
                }

            }
        }
        if (min==Integer.MAX_VALUE) return 0;
        else return min;
    }
}