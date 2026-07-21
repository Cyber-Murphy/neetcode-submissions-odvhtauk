class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // my approach is first to find in which row the target can be present
        int m=matrix.length; //row
        int n=matrix[0].length;
        for(int i=0;i<m;i++){
            if(matrix[i][0]<=target && target<=matrix[i][n-1]){
                // target is present in this row
                //apply binary search 
                 int l=0; int r=n-1;
                 while(l<=r){
                    int mid=l+(r-l)/2;
                    if(matrix[i][mid]==target){
                        return true;
                    }
                    else if(matrix[i][mid]>target){
                        r--;
                    }
                    else l++;
                 }
            }
        }
        return false;
    }
}