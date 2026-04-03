class Solution {
    public int lengthOfLongestSubstring(String s) {
      
        int max=0;
        Set<Character> set= new HashSet<>();
      int l=0;
      int r= 0;
      char[] arr= s.toCharArray();
      while(r<arr.length)
      {
            while(l<arr.length && set.contains(arr[r]))
            {

                set.remove(arr[l]);
                l++;
            }
            max= Math.max(max, r-l+1);
            set.add(arr[r]);
             r++;
      }
      return max;
    }
}

