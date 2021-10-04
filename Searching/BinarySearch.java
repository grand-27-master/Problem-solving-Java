public class BinarySearch {
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4};
        int val=3;
        int first=0,last=arr.length-1,mid=(first+last)/2;

        while (first<=last) {
            if(arr[mid]==val)
            System.out.println(mid);

            if(arr[mid]<val)
            first=mid+1;
            else
            last=mid-1;
        }
    }
}
