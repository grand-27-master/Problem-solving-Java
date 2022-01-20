import java.util.*;

public class stack {
    public static void main(String... args) {
        Stack<String>s=new Stack<String>();

        s.add("gauri");
        s.add("manish");

        s.pop();

        Iterator it=s.iterator();
        while(it.hasNext())
        System.out.print(it.next()+" ");
    }
}
