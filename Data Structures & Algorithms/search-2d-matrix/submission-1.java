class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int n = matrix.length;
        int m = matrix[0].length;

        for(int i =0; i<n ; i++){
         if(matrix[i][0] <= target && target<= matrix[i][m-1]){
            return bs(matrix[i], target) !=-1;
         }
        
    }
    return false;
}
public int bs(int[] matrix, int target){
    int low = 0;
    int high = matrix.length-1;

    

    while(low<=high){
        int mid = (low+high)/2;
        if(matrix[mid] == target){
            return mid;
        }
        else if(target > matrix[mid]){
            low = mid+1;
        }
        else{
            high = mid -1;
    }
}
return -1;
}
}
