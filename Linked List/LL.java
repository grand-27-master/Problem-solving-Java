class LL{
    Node head;

     class Node
    {
        int data;
        Node next;

        Node(int d)
        {
            data=d;
            next=null;
        }

         void printList(Node head)
        {
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next; // helps to iterate forward
            }
        }

        void addfront(int newdata, Node head)
        {
            Node newnode=new Node(newdata);

            if(head==null)
            {
                head=newnode;
                head.next=null;
            }
            else{
                newnode.next=head;
                head=newnode;
            }
        }

        void addafternode(Node head, Node prev_node, int newdata)
        {
            Node newnode=new Node(newdata);

            newnode.next=prev_node.next;
            prev_node.next=newnode;
        }

        void addend(Node head, int newdata)
        {
            Node newnode=new Node(newdata);
            Node temp=head;

            while(temp.next!=null)
            temp=temp.next; // move forward through the list

            temp.next=newnode; // as temp is the last node, we can add newnode to the end
            newnode.next=null;
        }

        void delete(Node head,int key)
        {
            // Store head node
        Node temp = head, prev = null;

        // If head node itself holds the key to be deleted
        if (temp != null && temp.data == key) {
            head = temp.next; // Changed head
            return;
        }

        // Search for the key to be deleted, keep track of
        // the previous node as we need to change temp.next
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        // If key was not present in linked list
        if (temp == null)
            return;

        // Unlink the node from linked list
        prev.next = temp.next;
        }
    }

    public static void main(String[] args)
    {
        LL l=new LL();

        // first node will be head
        l.head=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);


        /*  Three nodes have been allocated dynamically.
          We have references to these three blocks as head, 
          second and third
 
          llist.head        second              third
             |                |                  |
             |                |                  |
         +----+------+     +----+------+     +----+------+
         | 1  | null |     | 2  | null |     |  3 | null |
         +----+------+     +----+------+     +----+------+ 
         */


         // link first node to the 2nd node
         l.head.next=second;

         /*  Now next of the first Node refers to the second.  So they
            both are linked.
 
         llist.head        second              third
            |                |                  |
            |                |                  |
        +----+------+     +----+------+     +----+------+
        | 1  |  o-------->| 2  | null |     |  3 | null |
        +----+------+     +----+------+     +----+------+ */

        // link second node to the 3rd node
        second.next=third;


         /*  Now next of the second Node refers to third.  So all three
            nodes are linked.
 
         llist.head        second              third
            |                |                  |
            |                |                  |
        +----+------+     +----+------+     +----+------+
        | 1  |  o-------->| 2  |  o-------->|  3 | null |
        +----+------+     +----+------+     +----+------+ */

        l.printList();
    }
}