class Solution {
    public int[] productExceptSelf(int[] nums) {
        int mul=1;
        for(int n: nums)
        {
            mul*=n;
        }
        //check if array contains zero 
        int c=0;
        int mul2=1;
        for(int n: nums)
        {
            if (n ==0){
                c++;
            }
            else{
                mul2*=n;
            }
        }
        int [] arr= new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                arr[i]=mul/nums[i];
            }
            else{
                if(c==1){
                    arr[i]=mul2;
                }
                else{
                    arr[i]=0;
                }
            }
        }
        return arr;
    }
}  
