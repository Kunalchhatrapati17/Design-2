/* Time Complexity: O(1)
   Space Complexity:O(1)
   */
class MyQueue {
    Stack<Integer> instk;
    Stack<Integer> outstk;

    public MyQueue() {
       instk=new Stack<>(); //Created a stack named instk
       outstk=new Stack<>(); //Created a stack named outstk
        
    }
    
    public void push(int x) {
        instk.push(x); //Push elements to in stack
        
    }
    
    public int pop() {
        peek(); //Call the peek element
        return outstk.pop();//Pop elements from the top of the stack
     
    }
    
    public int peek() {
       if(outstk.isEmpty()){ //If out is empty
          while(!instk.isEmpty()){ //loop until in stack is empty
          outstk.push(instk.pop());//Push elements into the in stack

          }
       }        
       return outstk.peek();//Return peek element from out stack
    }
    
    public boolean empty() {
        return instk.isEmpty() && outstk.isEmpty();//Return Boolean value if in stack and out stack is empty
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */