import java.util.*;

public class deque {
    public static void main(String[] args)
    {
        // doubly ended queue
        Deque<Integer>d=new ArrayDeque<>();
        d.add(1);
        d.addLast(2);
        d.addFirst(3);
        d.removeLast();

        System.out.println(d);
    }
}
