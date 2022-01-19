public class DLL {
    Node head;

  static  class Node
    {
        int data;
        Node prev;
        Node next;

        Node(int d)
        {
            data=d;
            prev=null;
            next=null;
        }
    }

    public void printlist(Node node)
    {
        Node last = null;
        // System.out.println("Traversal in forward Direction");
        while (node != null) {
            System.out.print(node.data + "->");
            last = node;
            node = node.next;
        }
    }
    public static void main(String... args)
    {
        DLL dll=new DLL();
        dll.head=new Node(1);
        dll.head.next=new Node(2);
        dll.head.next.next=new Node(3);

        dll.printlist(dll.head);
    }
}
