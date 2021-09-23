
import java.util.*;

public class intro {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        n=arr.length;

       for(int i=0;i<n;i++)
       arr[i]=sc.nextInt();

       for(int i=0;i<n;i++)
       System.out.print(arr[i]+" ");
    }
}