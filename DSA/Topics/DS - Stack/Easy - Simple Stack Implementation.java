import java.util.LinkedList;

public class Problem {

   static LinkedList<Integer> stack = new LinkedList<>();
   static int top = -1;
   public static void main(String[] args) {
      

   System.out.println(stack.size());   
   stack.push(203);
   stack.push(223);
   stack.push(221);
   stack.push(11);
   stack.push(4556);
   System.out.println(stack.size());   

   stack.pop();
   stack.pop();
   stack.pop();
   stack.pop();
   stack.pop();

   System.out.println(stack.size()); 
   System.out.println(stack.isEmpty());

      
   }

   static void push(int x){
      top++;
      stack.add(x);
   }

   static int pop(){
      int x = stack.get(top);
      top--;
      return x; 
   }

   static int size(){
      return top+1;
   }

   static boolean isEmpty(){
      return (top == -1);
   }

   static int peek(){
      return stack.get(top);
   }
}