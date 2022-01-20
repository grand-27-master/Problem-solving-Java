import java.util.*;

public class linkedlist {
    public static void main(String... args) {
        LinkedList<String>ll=new LinkedList<String>();

        ll.add("gauri");
        ll.add("manish");

        Iterator it=ll.iterator();
        while(it.hasNext())
        System.out.print(it.next()+"->");
    }
}
