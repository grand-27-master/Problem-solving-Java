import java.util.*;
public class vector {
    public static void main(String... args) {
        Vector<Integer>v=new Vector<Integer>();

        v.add(1);
        v.add(2);

        Iterator it=v.iterator();
        while(it.hasNext())
        System.out.print(it.next()+" ");
    }
}
