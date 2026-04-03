class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> st= new ArrayDeque<>();
        for(String s : tokens)
        {
                if(s.equals("+"))
                {
                        int left= st.pop();
                        int right= st.pop();
                        st.push(left+right);
                }
                else if(s.equals("-"))
                {
                        int left1=st.pop();
                        int right1=st.pop();
                        st.push(right1-left1);
                }
                else if(s.equals("*"))
                {
                        int left2=st.pop();
                        int right2=st.pop();
                        st.push(left2*right2);
                }
                else if(s.equals("/"))
                {
                        int left3=st.pop();
                        int right3=st.pop();
                        st.push(right3/left3);
                }
                else{
                        st.push(Integer.parseInt(s));
                }

        }
        return st.peek();
    }
}
