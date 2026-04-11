class MinStack {
    Stack<Integer> stk;
    Stack<Integer> Minstk;

    public MinStack() {
        stk = new Stack<>();
        Minstk = new Stack<>();
        
    }
    
    public void push(int val) {
        stk.push(val);
        if(Minstk.isEmpty() || val <= Minstk.peek())
        Minstk.push(val);
        
    }
    
    public void pop() {
        int popped = stk.pop();

        if(popped == Minstk.peek()){
            Minstk.pop();
        }
        
    }
    
    public int top() {
        return stk.peek();
        
    }
    
    public int getMin() {
        return Minstk.peek();
        
    }
}
