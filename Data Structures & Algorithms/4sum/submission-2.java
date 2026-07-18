class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> arr = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            for (int k = i + 1; k < nums.length - 2; k++) {
                // skip duplicate k
                if (k > i + 1 && nums[k] == nums[k - 1])
                    continue;
                int l = k + 1;
                int r = nums.length - 1;
                while (l < r) {
                    long sum =(long) nums[i] + nums[k] + nums[l] + nums[r];

                    if (sum > target) {
                        r--;
                    } else if (sum < target) {
                        l++;
                    } else {
                        arr.add(List.of(nums[i], nums[k], nums[l], nums[r]));
                        l++;
                        r--;
                        while (l < r && nums[l] == nums[l - 1]) {
                            l++;
                        }
                        while (l < r && nums[r] == nums[r + 1]) {
                            r--;
                        }
                    }
                }
            }
        }
        return arr;
    }
}