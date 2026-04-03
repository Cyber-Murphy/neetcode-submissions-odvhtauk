class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        Deque<Integer> st= new ArrayDeque<>();
        int [] res= new int[temperatures.length];
        res[temperatures.length-1]=0;
        st.push(temperatures.length-1);
        for(int i=temperatures.length-2;i>=0;i--)

        {
            
            while(!st.isEmpty() && temperatures[i]>=temperatures[st.peek()])
            {
                    st.pop();
            }
            if(!st.isEmpty()&&temperatures[i]<temperatures[st.peek()])
            {
                res[i]= st.peek()-i;
                
            }
            if(st.isEmpty())
            {
                res[i]=0;
                 st.push(i);
            }
            else{
                st.push(i);
            }
        }
        return res;
    }
}
