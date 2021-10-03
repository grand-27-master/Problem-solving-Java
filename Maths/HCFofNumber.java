import java.util.*;

public class HCFofNumber {
    public static void main(String... args)
    {
        //int a=24,b=12;
        // int rem=a%b;
        // int hcf;
        //int max=0;

        // for (int i = 1; i < a; i++) {
        //     if(a%i==0)
        //     System.out.println(i);
        // }

        // for (int j = 1; j < b; j++) {
        //     if(b%j==0)
        //     System.out.println(j);
        // }

        // System.out.println(Math.max(i,j));

        System.out.println(hcf(12,24));


    }

    static int hcf(int a,int b)
    {
        if(a==0)
        return b;
        return(hcf((b%a),a));
    }
}
