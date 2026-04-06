class Solution {
    public int longestConsecutive(int[] nums) {
        
        int n = nums.length;

        if(n==0){
            return 0;
        }

        Set<Integer> set = new HashSet<>();
        
        for(int i=0; i<n; i++){
            set.add(nums[i]);
        }
        int longest =1;

        for(int it : set){
            if(!set.contains(it-1)){
                int curnum = it;
                int cnt =1;
                while(set.contains(curnum+1)){
                    cnt++;
                    curnum++;
                }
                
                longest = Math.max(longest, cnt);
            }

        

        }
            return longest;



        
        
    }
}
