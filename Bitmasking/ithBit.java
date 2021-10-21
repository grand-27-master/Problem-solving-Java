public class ithBit{
    public static void main(String... args)
    {
        int n=13,i=2;
        int mask=(1<<i-1);

        System.out.print(n&(mask));
    }
}