class Solution {
    public int search(int[] nums, int target) {
        //find mid
        //discard the unsorted half
        //in sorted half , check if target is present 
        //if not then move the pointer to the other half

        int l=0;
        int r= nums.length-1;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(nums[mid]==target)
                {
                    return mid;
                }
            //if left is sorted
            if(nums[l]<=nums[mid])
            {
                    // check if target is present or not in the sorted half
                    if(nums[l]<=target && target<=nums[mid])
                    {
                        r=mid-1;
                    }
                    else{
                        l=mid+1;
                    }
            }
            else{
                if(nums[mid]<=target && target<=nums[r])
                {
                    l=mid+1;
                }
                else{
                    r= mid-1;
                }

            }
        }
        return -1;
    }
}
