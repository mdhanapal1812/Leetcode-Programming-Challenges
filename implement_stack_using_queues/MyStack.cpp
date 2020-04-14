class MyStack {
public:
    queue<int>q1;
    queue<int>q2;
    /** Initialize your data structure here. */
    MyStack() {
        
    }
    
    /** Push element x onto stack. */
    void push(int x) {
        q1.push(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    int pop() {
        if(q1.empty()){
            return -1;
        }else{
            while(q1.size() != 1){
            int x = q1.front();
            q1.pop();
                q2.push(x);
               
                }
        }
        int x2 = q1.front();
        q1.pop();
        
        while(!(q2.empty())){
               int x = q2.front();
            q2.pop();
                q1.push(x);
        }
        return x2;
    }
    
    /** Get the top element. */
    int top() {
        if(q1.empty()){
            return -1;
        }else{
            while(q1.size() != 1){
            int x = q1.front();
            q1.pop();
                q2.push(x);
               
                }
        }
        int x2 = q1.front();
        q1.pop();
        q2.push(x2);

        
        while(!(q2.empty())){
               int x = q2.front();
            q2.pop();
                q1.push(x);
        }
        return x2;
    }
    
    /** Returns whether the stack is empty. */
    bool empty() {
        return q1.empty();
    }
};

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack* obj = new MyStack();
 * obj->push(x);
 * int param_2 = obj->pop();
 * int param_3 = obj->top();
 * bool param_4 = obj->empty();
 */