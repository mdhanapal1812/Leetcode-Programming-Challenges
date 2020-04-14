class MinStack {

    private Stack<int[]> stack = new Stack<>();
    /** initialize your data structure here. */
    public MinStack() {
        
    }
    
    public void push(int x) {
        if(stack.isEmpty()){
            stack.push(new int[]{x,x});
           
        }else{
            int currentMin = stack.peek()[1];
            stack.push(new int[]{x,Math.min(x,currentMin)});
        }
        
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek()[0];
    }
    
    public int getMin() {
        return stack.peek()[1];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */