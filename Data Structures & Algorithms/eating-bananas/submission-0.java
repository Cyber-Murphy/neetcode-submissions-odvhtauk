class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min=1;
        int max=0;
        for(int n:piles){
            max=Math.max(max,n);
        }
        while(min<=max)
        {
            int mid=min+(max-min)/2;

            int hours=0;
            for(int j:piles)
            {
                hours+=(j+mid-1)/mid;
            }
            if(hours>h){
                min=mid+1;

            }
            else max=mid-1;
        }
    }
    return min;
}
