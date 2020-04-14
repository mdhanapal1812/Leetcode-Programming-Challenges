class MyQueue {
public:
    stack<int> s1;
    stack<int> s2;
   
    /** Initialize your data structure here. */
    MyQueue() {
   
    }
    
    /** Push element x to the back of queue. */
    void push(int x) {
        s1.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    int pop() {
        
        if(s1.empty()){
            return -1;
        }
        

        while(!(s1.empty())){
            int x1 = s1.top();
            s2.push(x1);
            s1.pop();
        }
            
        
        int x2 = s2.top();
        s2.pop();
      
            while(!s2.empty()){
      
            int x3 = s2.top();
            s1.push(x3);
                s2.pop();
        
            }
       
        return x2;
    }
    
    /** Get the front element. */
    int peek() {
           if(s1.empty()){
            return -1;
        }
        

        while(!(s1.empty())){
            int x1 = s1.top();
            s2.push(x1);
            s1.pop();
        }
            
        
        int top = s2.top();
      
            while(!s2.empty()){
      
            int x3 = s2.top();
            s1.push(x3);
                s2.pop();
        
            }
        return top;
    }
    
    /** Returns whether the queue is empty. */
    bool empty() {
    return s1.empty();
        
    }
};
