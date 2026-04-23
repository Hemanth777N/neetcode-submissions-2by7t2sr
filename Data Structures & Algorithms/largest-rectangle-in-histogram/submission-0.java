class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] pse = prevSmallElement(heights);
        int[] nse = nextSmallElement(heights);
        int MaxArea = 0;

        for(int i=0; i<=n-1; i++){

            int width = nse[i] - pse[i] - 1;
            int area = heights[i] * width;
            MaxArea = Math.max(MaxArea, area); 
        }
        return MaxArea;

        
    }

    public int[] prevSmallElement(int[] heights){
        int n = heights.length;
        Stack<Integer> stk = new Stack<>();
        int[] near = new int[n];

        for(int i=0; i<=n-1; i++){
            while(!stk.isEmpty() && heights[stk.peek()]>=heights[i]){
                stk.pop();
            }
            near[i] = stk.isEmpty() ? -1 : stk.peek();
            stk.push(i);
        }
        return near;
    }


    public int[] nextSmallElement(int[] heights){
        int n = heights.length;
        Stack<Integer> stk = new Stack<>();
        int[] next = new int[n];

        for(int i =n-1; i>=0; i--){
            while(!stk.isEmpty() && heights[stk.peek()]>=heights[i]){
                stk.pop();
            }
            next[i] = stk.isEmpty() ? n : stk.peek();
            stk.push(i);
        }
        return next;
    }
}
