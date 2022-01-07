import java.util.HashMap;
import java.util.HashSet;

import java.util.*;

public class UniqueOccurrences {
    public static void main(String... args)
    {
        int arr[]={1,2,2,1,1,3};

        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i:arr)
        map.put(i,map.getOrDefault(i,0)+1);

        HashSet<Integer>set=new HashSet(map.values());

        if(set.size()==map.size())
        System.out.print("unique");
        else
        System.out.print("not unique");
    }
}
