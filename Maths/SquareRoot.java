public class SquareRoot {
    public static void main(String[] args)
    {
        int n=36;
        int start=0,end=n,mid;

        //int result;

        while(start<=end)
        {
            mid=(start+end)/2;

            if(mid*mid==n)
            System.out.println(mid);

            if(mid*mid>n)
            end=mid-1;

            else
            start=mid+1;
        }
    }
}
