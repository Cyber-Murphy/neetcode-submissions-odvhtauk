class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st= new Stack<>();
        for(String s : operations)
        {
                if(s.equals("+"))
                {
                        int left = (st.pop());
                        int secondleft=(st.pop());
                        
                        st.push(secondleft);
                        st.push(left);
                        int sum= left+secondleft;
                        st.push(sum);
                }
                else if(s.equals("D"))
                {
                       
                        st.push(2*st.peek());
                }
                else if(s.equals("C"))
                {
                        st.pop();
                }
                else{
                        st.push(Integer.parseInt(s));
                }

        }
        int res=0;
        while(!st.isEmpty())
        {
                res+=st.pop();
        }
        return res;

    }
}