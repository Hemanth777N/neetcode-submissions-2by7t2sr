class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int j = numbers.length-1;
        int i=0;

        while(i<j){
            int res = numbers[i] + numbers[j]; 
            if(res == target){
                return new int[]{i+1,j+1};
            }
            if(res > target){
                j--;

            }
            else{
                i++;
            }
        }
        return new int[0];
        
    }
}
