public class CountZeros {
    public static void main(String[] args)
    {
        System.out.println(print(1001,0));
    }

    static int print(int n, int count)
    {
        if(n==0)
        return count;

        if(n%10==0)
        return print(n/10,count++);

        return print(n/10,count);
    }
}
