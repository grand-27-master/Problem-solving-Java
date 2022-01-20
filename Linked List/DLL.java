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

    public void addfront(int newdata)
    {
        Node newnode=new Node(newdata);

        if(head==null)
        {
            head=newnode;
            head.next=null;
            newnode.prev=null;
        }
        else
        {
            newnode.next = head;
            newnode.prev = null;
            head.prev=newnode;
            head=newnode;
        }
    }

    void addend(int new_data)
    {
          /* 1. allocate node 
     * 2. put in the data */
    Node new_node = new Node(new_data);

    Node last = head; /* used in step 5*/

    /* 3. This new node is going to be the last node, so
     * make next of it as NULL*/
    new_node.next = null;

    /* 4. If the Linked List is empty, then make the new
     * node as head */
    if (head == null) {
        new_node.prev = null;
        head = new_node;
        return;
    }

    /* 5. Else traverse till the last node */
    while (last.next != null)
        last = last.next;

    /* 6. Change the next of last node */
    last.next = new_node;

    /* 7. Make last node as previous of new node */
    new_node.prev = last;
    }

    public void InsertBefore(Node next_node, int new_data)
    {
        /*Check if the given nx_node is NULL*/
        if(next_node == null)
        {
            System.out.println("The given next node can not be NULL");
            return;
        }
        
        //Allocate node, put in the data
        Node new_node = new Node(new_data);
        
        //Making prev of new node as prev of next node
        new_node.prev = next_node.prev;
        
        //Making prev of next node as new node
        next_node.prev = new_node;
        
        //Making next of new node as next node
        new_node.next = next_node;
        
        //Check if new node is added as head
        if(new_node.prev != null)
            new_node.prev.next = new_node;
        else
            head = new_node;
    }

    public void InsertAfter(Node prev_Node, int new_data)
{

    /*1. check if the given prev_node is NULL */
    if (prev_Node == null) {
        System.out.println("The given previous node cannot be NULL ");
        return;
    }

    /* 2. allocate node 
    * 3. put in the data */
    Node new_node = new Node(new_data);

    /* 4. Make next of new node as next of prev_node */
    new_node.next = prev_Node.next;

    /* 5. Make the next of prev_node as new_node */
    prev_Node.next = new_node;

    /* 6. Make prev_node as previous of new_node */
    new_node.prev = prev_Node;

    /* 7. Change previous of new_node's next node */
    if (new_node.next != null)
        new_node.next.prev = new_node;
}

void deleteNode(Node del)
{

    // Base case
    if (head == null || del == null) {
        return;
    }

    // If node to be deleted is head node
    if (head == del) {
        head = del.next;
    }

    // Change next only if node to be deleted
    // is NOT the last node
    if (del.next != null) {
        del.next.prev = del.prev;
    }

    // Change prev only if node to be deleted
    // is NOT the first node
    if (del.prev != null) {
        del.prev.next = del.next;
    }

    // Finally, free the memory occupied by del
    return;
}
    public static void main(String... args)
    {
        DLL dll=new DLL();
        // dll.head=new Node(1);
        // dll.head.next=new Node(2);
        // dll.head.next.next=new Node(3);

        // dll.printlist(dll.head);

        // Insert 6. So linked list becomes 6->NULL
        dll.addend(6);

        // Insert 7 at the beginning. So 
        // linked list becomes 7->6->NULL
        dll.addfront(7);

        // Insert 1 at the beginning. So 
        // linked list becomes 1->7->6->NULL
        dll.addfront(1);

        // Insert 4 at the end. So linked 
        // list becomes 1->7->6->4->NULL
        dll.addend(4);

        // Insert 8, after 7. So linked 
        // list becomes 1->7->8->6->4->NULL
        dll.InsertAfter(dll.head.next, 8);
      
        // Insert 5, before 8.So linked
        // list becomes 1->7->5->8->6->4
        dll.InsertBefore(dll.head.next.next, 5);

        System.out.println("Created DLL is: ");
        dll.printlist(dll.head);
    }
}
