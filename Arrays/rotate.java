public class rotate{
    public static void main(String[] args)
    {
       
        int[] arr={7,5,2,11,2,43,1,1};
        int n=arr.length;
        int k=2;
         /* brute force method : O(n^2)

        for(int i=0;i<k;i++)
        {
            int temp=arr[0];
            for(int j=0;j<n-1;j++)
            {
                arr[j]=arr[j+1];
            }
            arr[n-1]=temp;
        }

        for(int i:arr)
        System.out.print(i+" ");
        
    }
    */

    // optimised method: O(n)
    int[] temp=new int[k];

    for(int i=0;i<k;i++)
    temp[i]=arr[i];

    for(int i=k;i<n;i++)
    arr[i - k] = arr[i];

    for(int i=0;i<k;i++)
    arr[n-k+i]=temp[i];

    for(int i:arr)
    System.out.print(i+" ");
}

}