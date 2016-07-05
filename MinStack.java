//Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
//
//        push(x) -- Push element x onto stack.
//        pop() -- Removes the element on top of the stack.
//        top() -- Get the top element.
//        getMin() -- Retrieve the minimum element in the stack.

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

public class MinStack {
    Stack<Integer> stack;
    int min;
    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<Integer>();
        min = Integer.MAX_VALUE;
    }

    public void push(int x) {
        if(x<=min){
            stack.push(min);
            min = x;
        }
        stack.push(x);
    }

    public void pop() {
        if(min == stack.peek() ){
            stack.pop();
            min = stack.peek();
        }
        stack.pop();
        if(stack.empty()){
            min=Integer.MAX_VALUE;
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}
