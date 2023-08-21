        
        for (Map.Entry<Character, Integer> as : lookup.entrySet()) {
            System.out.println(as.getKey()+" "+as.getValue());
        }


        for (Integer x : lookup.values()) {
            System.out.println(x);
        }



        Integer x = 200;
        Integer y = 200;
        if(x.equals(y)){

        }


        - - - - - - - - - - - - - 

class Problem{

    public static void main(String[] args) {
      
        
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        head.next.next.next.next.next.next = new Node(70);

        print(head);
        System.out.println();
        print(reverseBetween(head, 3, 5));


    }


    static Node reverseBetween(Node head, int left, int right) {
        
        Node leftNode = head;
        Node rightNode = head;

        Node previousOfLeft = null;
        Node nextOfRight = null;

        int stepCount = 1;
        while (stepCount != left) {
            previousOfLeft = leftNode;
            leftNode = leftNode.next;
            stepCount++;
        }

        stepCount = 1;
        while (stepCount != right) {
            rightNode = rightNode.next;
            stepCount++;
        }
        nextOfRight = rightNode.next;

        rightNode.next = null;      // reverse till here i.e. not null
        Node rightNodeAsHead = reverse(leftNode);
        previousOfLeft.next = rightNodeAsHead;
        leftNode.next = nextOfRight;

        return head;
    }

    static Node reverse(Node head){
        Node previousOfCurrent = null;
        Node current = head;
        Node nextOfCurrent = null;
        
        while(current != null){
            nextOfCurrent = current.next;
            current.next = previousOfCurrent;
            previousOfCurrent = current;
            current = nextOfCurrent;
        }

        return previousOfCurrent;
    }

    static void print(Node head){
        if(head == null){
            return;
        }
        System.out.print(head.data+", ");
        print(head.next);
    }


}


class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
    }
}