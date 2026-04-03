class Solution {
    public int[] findBuildings(int[] heights) {
        Deque<Integer> st=  new ArrayDeque<>();
        st.push(heights.length-1);
        List<Integer> res= new ArrayList<>();
        for(int i=heights.length-2;i>=0;i--)
        {
            while(!st.isEmpty() && heights[i]>heights[st.peek()])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                st.push(i);
                res.add(i);
            }
            else{
                st.push(i);
            }
        }
        res.add(heights.length-1);// for last element
        int[] arr= new int[res.size()];
        for(int j=0;j<arr.length;j++)
        {
            arr[j]=res.get(j);
        }
        Arrays.sort(arr);
        return arr;
    }
}