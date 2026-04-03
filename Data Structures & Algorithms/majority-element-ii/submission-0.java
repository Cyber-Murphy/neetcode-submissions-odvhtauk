class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> map= new HashMap<>();
        for(int n:nums){
        map.put(n, map.getOrDefault(n,0)+1);
        }
        List<Integer> result= new ArrayList<>();
        for(Map.Entry<Integer,Integer> e : map.entrySet())
        {
            if(e.getValue()>nums.length/3){
                result.add(e.getKey());
            }
        }
        return result;

    }
}