import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;

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


      String s = "kousik";

      if(s.charAt(0) == 'k'){
         System.out.println(true);
      }else{
         System.out.println(false);
      }


      char[] stack11 = new char[100000];
      String dd = new String(stack11).substring(2,3);



    


   }
}