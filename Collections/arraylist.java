import java.util.*;

public class arraylist{
    public static void main(String... args)
    {
        ArrayList<String>list=new ArrayList<String>();

        list.add("rohan");
        list.add("rahul");

        Iterator it=list.iterator();

        while(it.hasNext())
        System.out.println(it.next());
    }
}