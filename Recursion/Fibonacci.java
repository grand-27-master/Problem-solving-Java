public class Fibonacci{
    public static void main(String[] args)
    {
        System.out.print(result(8));
    }

    static int result(int n)
    {

        if(n==0 || n==1 || n==2)
        return n;
        else
        return result(n-1)+result(n-2);
    }
}