class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1; 
        int high = max(piles);
        int ans  = Integer.MAX_VALUE;

        while(low<=high){
            int mid = (low+high)/2;
            int totalhrs = func(piles, mid);
            if(totalhrs<= h){
                ans = mid;
                high= mid - 1;
            }
            else{
                low = mid +1;
            }
        }
        return ans;
        
    }
    public int func(int[] piles, int mid){
        int n = piles.length;
        int hrs = 0;
        for(int i =0; i<n; i++){
            hrs += Math.ceil((double)piles[i]/mid);
        }
        return hrs;
    }
    public int max(int[] piles){
        int n = piles.length;
        int res =piles[0];
        for(int i =1; i<n;i++){
            if(piles[i] > res){
                res = piles[i];

            }
        }
        return res;
    }
}
