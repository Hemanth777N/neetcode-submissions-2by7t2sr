class Solution {
    public int longestConsecutive(int[] nums) {
         
        int n = nums.length;
        int longest =1;
        int curcnt =1;
          if(n==0){
            return 0;
        }
       

        Arrays.sort(nums);
         int lastsmall = nums[0];
     

        for(int i =1; i<n; i++){
            if(nums[i] == lastsmall +1)  {
            curcnt++;
            lastsmall = nums[i];

               }
               else if(nums[i] != lastsmall){
                curcnt =1;
                lastsmall = nums[i];
               }
               longest = Math.max(longest, curcnt);
        }
        return longest;

        
    }
}
