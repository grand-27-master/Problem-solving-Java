import java.util.*;

public class InbuiltSort {
    public static void main(String[] args)
    {
        int[] arr={1,4,2,6,3,5};

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
