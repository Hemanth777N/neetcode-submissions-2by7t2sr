class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        int n = nums.length;

        for(int i=0; i<n; i++){
            Set<Integer> triplets = new HashSet<>();
            for(int j =i+1; j<n; j++){
                int complement = -(nums[i]+ nums[j]);
                if(triplets.contains(complement)){
                    List<Integer> xyz = Arrays.asList(nums[i], nums[j], complement);
                    Collections.sort(xyz);
                    res.add(xyz);

                }
                triplets.add(nums[j]);
            }
        }
        return new ArrayList(res);
        
    }
}
