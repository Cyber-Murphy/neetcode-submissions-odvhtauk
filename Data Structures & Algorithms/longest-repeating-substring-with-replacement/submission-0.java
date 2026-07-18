class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map=new HashMap<>();
        
        int l=0;
        int r=0;
        int maxfreq=0;
        int len=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
            maxfreq=Math.max(maxfreq,map.get(c));
            while((i-l+1-maxfreq)>k){
                char left=s.charAt(l);
                map.put(left,map.get(left)-1);
                l++;
            }
            len=Math.max(len,i-l+1);
        }
        return len;
    }
}
