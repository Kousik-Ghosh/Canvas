/* https://leetcode.com/problems/implement-stack-using-queues/description/ */

class MyStack {

    static ArrayDeque<Integer> queue;
    public MyStack() {
        queue = new ArrayDeque<>();
    }
    
    public void push(int x) {
        queue.addLast(x);
    }
    
    public int pop() {
        for(int i = 0; i < queue.size() - 1; i++){
            queue.addLast(queue.removeFirst());
        }
        return queue.removeFirst();
    }
    
    public int top() {
        int top = -1;
        for(int i = 0; i < queue.size() - 1; i++){
            queue.addLast(queue.removeFirst());
        }
        top = queue.removeFirst();
        queue.addLast(top);
        return top;
    }
    
    public boolean empty() {
        return queue.isEmpty();
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