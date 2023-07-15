import java.util.LinkedList;
import java.util.Queue;

class Node{
      int data;
      Node left;
      Node right;
      Node(int x){
         data = x;
      }
}

public class Problem {

   static Queue<Node> nodeQueue = new LinkedList<>();

   public static void main(String[] args) {
      Node root = new Node(10);
      populate(root);
      depthFirstSearch(root);
      breadthFirstSearch(root);
   }  



   static void depthFirstSearch(Node root){
      if(root == null){
         return;
      }

      depthFirstSearch(root.left);
      System.out.println(root.data);
      depthFirstSearch(root.right);
   }


   static void breadthFirstSearch(Node root){
      if(root == null){
         return;
      }

      System.out.println(root.data);

      nodeQueue.add(root.left);
      nodeQueue.add(root.right);

      breadthFirstSearch(nodeQueue.poll());
   }

   static void populate(Node root){
      root.left = new Node(20);
      root.right = new Node(30);

      root.left.left = new Node(40);
      root.left.right = new Node(50);

      root.right.left = new Node(60);
      root.right.right = new Node(70);

      root.left.left.left = new Node(80);
      root.left.left.right = new Node(90);

      root.left.right.left = new Node(100);
      root.left.right.right = new Node(110);

      root.right.left.left = new Node(120);
      root.right.left.right = new Node(130);

      root.right.right.left = new Node(140);
      root.right.right.right = new Node(150);
   }

}