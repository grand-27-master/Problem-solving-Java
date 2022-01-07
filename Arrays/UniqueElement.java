public class UniqueElement {
    public static void main(String... args)
    {
        int[] arr={1,1,3,5,5};
        int ans=0;

        for(int i=0;i<arr.length;i++){

        //XOR operation
        ans^=arr[i];
        }
            
        System.out.print(ans);
    }
}
