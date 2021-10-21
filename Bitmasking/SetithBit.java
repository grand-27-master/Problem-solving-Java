// change ith bit to one if not already

public class SetithBit {
    public static void main(String[] args)
    {
        int n=13,i=2;

        int mask=(1<<i);

        System.out.print((mask)|n);
    }
}
