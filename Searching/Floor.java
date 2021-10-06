public class Floor {
    public static void main(String[] args)
    {
        int[] arr={2,3,5,9,14,16,18};
        int n=arr.length;
        int target=15;
        
        int start=0,end=n-1;
        while (start<=end) {
            int mid=(start+end)/2;

            if(arr[mid]==target)
            System.out.print(arr[mid]);

           else if(target<arr[mid])
            end=mid-1;
            
            else
            start=mid+1;
        }
       System.out.print(start-1);
    }
}
