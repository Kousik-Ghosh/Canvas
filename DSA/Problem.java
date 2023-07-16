import java.util.ArrayDeque;

public class Problem {
   public static void main(String[] args) {
      


      ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
      
      stack.push(10);
      stack.pop();
      stack.peek();


      ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
      
      queue.addLast(10);
      queue.removeFirst();
      

      queue.addFirst(10);
      queue.removeLast();


      

   }


}