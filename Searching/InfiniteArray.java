public class InfiniteArray {
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,45,23,6,476,74,523,453,56,3,5,2,7,8,5};
        int target=74;

        System.out.println(size(arr,target));
    }

    static int size(int[] arr,int target)
    {
        int first=0,last=1;

        while(target>arr[last])
        {
            int newFirst=last+1;
            //double window size
            last=last+2*(last-first+1);
            first=newFirst;
        }
        return search(arr,target,first,last);
    }


    static int search(int[] arr,int target,int first,int last)
    {
        int mid=(first+last)/2;
        while (first<=last) {
            if(arr[mid]==target)
            return mid;

            if(arr[mid]<target)
            first=mid+1;
            else
            last=mid-1;
        }
        return -1;
    }

}
