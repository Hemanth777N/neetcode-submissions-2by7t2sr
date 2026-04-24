class Solution {
    public int search(int[] nums, int target) {
        return binarysearch(nums, 0, nums.length -1, target);
        
    }

    public int binarysearch(int[] nums, int l, int r, int target){
        if(l>r){
            return -1;
        }
         
        while(l<=r){
        int m = (l+r)/2;
           
            if(nums[m] == target){
                return m;
            }
            else if(target > nums[m]){
                return binarysearch(nums,m+1, r, target);
            }
            else{
                return binarysearch(nums,l,m-1, target);

            }
        }
        return -1;
    }
}
