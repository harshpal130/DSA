class MyStack {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public MyStack() {
        
    }
    int top = -1;
    
    public void push(int x) {
        top = x;
        if(!q1.isEmpty()){
            q1.add(x);
        }else{
            q2.add(x);
        }
        
    }
    
    
    public int pop() {
        if(!q1.isEmpty()){
            while(q1.size()>1){
                top = q1.peek();
                q2.add(q1.remove());
            }
            return q1.remove();
        }
         while(q2.size()>1){
            top = q2.peek();
            q1.add(q2.remove());
            }
            return q2.remove();
        
    }
    
    public int top() {
        return top;
        
    }
    
    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */