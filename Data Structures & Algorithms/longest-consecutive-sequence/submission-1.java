class Solution {
    public int longestConsecutive(int[] nums) {

        if (nums.length == 0) return 0;

        Arrays.sort(nums);

        int max = 1;
        int count = 1;
        int r = 0;

        while (r < nums.length - 1) {

            if (nums[r] == nums[r + 1]) {
                r++; // skip duplicate
            }
            else if (nums[r] + 1 == nums[r + 1]) {
                count++;
                r++;
            }
            else {
                max = Math.max(max, count);
                count = 1;
                r++;
            }
        }

        max = Math.max(max, count);

        return max;
    }
}
