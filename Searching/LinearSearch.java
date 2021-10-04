public class LinearSearch {
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4};
        int val=3;

        System.out.println(search(arr,val));
    }

    static int search(int[] arr,int val)
    {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==val)
            return i;
        }
        return -1;
    }
}
