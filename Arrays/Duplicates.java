public class Duplicates {
    public static void main(String... args)
    {
        int arr[]={4, 2, 1, 3, 1};
        int ans=0;

        for(int i=0;i<arr.length;i++)
        ans^=arr[i];

        for(int j=0;j<arr.length;j++)
        ans^=j;

        System.out.print(ans);
    }
}
