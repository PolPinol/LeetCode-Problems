class MinStack {
    
    private ArrayList<Integer> stack;
    
    public MinStack() {
        this.stack = new ArrayList<Integer>();
    }
    
    public void push(int val) {
        this.stack.add(val);
    }
    
    public void pop() {
        this.stack.remove(stack.size()-1);
    }
    
    public int top() {
        return this.stack.get(stack.size()-1);
    }
    
    public int getMin() {
        ArrayList<Integer> tmpStack = new ArrayList<Integer>(stack);
        Collections.sort(tmpStack);
        return tmpStack.get(0);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */