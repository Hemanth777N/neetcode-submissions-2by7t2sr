class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> stk = new Stack<>();
        int maxarea = 0;

        for(int i =0; i<=n-1; i++){
            while(!stk.isEmpty() && heights[stk.peek()]>heights[i]){
                int height = heights[stk.pop()];
                int width = stk.isEmpty() ? i : i - stk.peek() - 1;
                maxarea = Math.max(maxarea, height * width);

            }
            stk.push(i);
        }
        while(!stk.isEmpty()){
            int height = heights[stk.pop()];
            int width = stk.isEmpty() ? n : n - stk.peek() - 1;
            maxarea = Math.max(maxarea, height * width);
        }
        return maxarea;
        
    }
}
