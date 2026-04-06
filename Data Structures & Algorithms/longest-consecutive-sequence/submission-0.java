class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        int longest =1;
        

        if(n==0){
            return 0;
        }
        for(int i=0; i<n; i++){
            int x=nums[i];
            int cnt=1;
            while(ls(nums, x+1) == true){
                x=x+1;
                cnt = cnt+1;


            }
            longest = Math.max(longest, cnt);
        }
        return longest;
        
    }
    public boolean ls(int[] nums, int num){
        int n = nums.length;
        for(int j =0; j<n;j++){
            if(nums[j]== num){
                return true;
            }
         
        }
           return false;
    }
}
